package sets;

import java.util.ArrayList;

import tiles.Tile;

public class SetManager {

    private ArrayList<SetCombination> setCombinations;

    public SetManager() {
        setCombinations = new ArrayList<SetCombination>();
    }

    public void addSetCombination(String name, Tile[] tiles) {
        setCombinations.add(new SetCombination(name, tiles));
    }

    public void addSetCombination(SetCombination combo) {
        setCombinations.add(combo);
    }

    public void removeSetCombination(SetCombination combo) {
        setCombinations.remove(combo);
    }

    public String[] getSetNames() {
        String[] names = new String[setCombinations.size()];
        for (int x = 0; x < names.length; x++)
            names[x] = setCombinations.get(x).getName();
        return names;
    }

    public SetCombination getSetCombination(String name) {
        for (SetCombination sc : setCombinations)
            if (name.equals(sc.getName()))
                return sc;
        return null;
    }
}
