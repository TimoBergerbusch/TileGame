package sets;

import tiles.Tile;

public class SetCombination {

    private String name;
    private Tile[] tiles;

    public SetCombination(String name, Tile[] tiles) {
        this.name = name;
        this.tiles = tiles;
    }


    /**
     * Gets tiles.
     *
     * @return Value of tiles.
     */
    public Tile[] getTiles() {
        return tiles;
    }

    /**
     * Gets name.
     *
     * @return Value of name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets new name.
     *
     * @param name New value of name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets new tiles.
     *
     * @param tiles New value of tiles.
     */
    public void setTiles(Tile[] tiles) {
        this.tiles = tiles;
    }


}
