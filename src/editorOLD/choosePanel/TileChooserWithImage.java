package editorOLD.choosePanel;

import java.awt.*;
import java.awt.image.BufferedImage;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

import editorOLD.WorldEditorOLD;
import gfx.Assets;

public class TileChooserWithImage extends JPanel {
    ImageIcon[] images;
    String[] tileStrings = {"Grass", "RoundBush"};
    JComboBox tileComboBox;

    public TileChooserWithImage() {
        super(new BorderLayout());

        images = new ImageIcon[tileStrings.length];
        Integer[] intArray = new Integer[tileStrings.length];
        for (int i = 0; i < tileStrings.length; i++) {
            intArray[i] = new Integer(i);
            images[i] = createImageIcon(tileStrings[i]);
        }

        tileComboBox = new JComboBox(intArray);
        ComboBoxRenderer renderer = new ComboBoxRenderer();
        tileComboBox.setRenderer(renderer);

        add(tileComboBox, BorderLayout.NORTH);
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    }

    protected static ImageIcon createImageIcon(String path) {
        BufferedImage image;
        switch (path) {
            case "RoundBush":
                image = Assets.roundBush;
                break;
            default:
                image = Assets.grass;
                break;
        }

        return new ImageIcon(image.getScaledInstance(WorldEditorOLD.width, WorldEditorOLD.height, Image.SCALE_SMOOTH));
    }

    public JComboBox getTileComboBox() {
        return tileComboBox;
    }

    class ComboBoxRenderer extends JLabel implements ListCellRenderer {

        public ComboBoxRenderer() {

        }

        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {

            int selectedIndex = ((Integer) value).intValue();

            if (isSelected) {
                setBackground(list.getSelectionBackground());
                setForeground(list.getSelectionForeground());
            } else {
                setBackground(list.getBackground());
                setForeground(list.getForeground());
            }

            ImageIcon icon = images[selectedIndex];
            setIcon(icon);

            return this;
        }
    }
}
