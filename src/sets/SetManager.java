package sets;

import java.util.ArrayList;
import java.util.Collections;

import tiles.StaticTiles;
import tiles.Tile;

public class SetManager {

    private ArrayList<Set> set;

    public SetManager() {
        set = new ArrayList<Set>();
    }

    public void addSet(String name, Tile[] tiles) {
        set.add(new Set(name, tiles));
    }

    public void addSet(Set combo) {
        set.add(combo);
    }

    public void removeSetCombination(Set combo) {
        set.remove(combo);
    }

    public String[] getSetNames() {
        String[] names = new String[set.size()];
        for (int x = 0; x < names.length; x++)
            names[x] = set.get(x).getName();
        return names;
    }

    public Set getSetCombination(String name) {
        for (Set sc : set)
            if (name.equals(sc.getName()))
                return sc;
        return set.get(0);
    }

    public Tile getTileByName(String name) {
        Tile[] tiles = getSetCombination("All Tiles").getTiles();
        for (int i = 0; i < tiles.length; i++)
            if (tiles[i].toString().equals(name))
                return tiles[i];
        return StaticTiles.grassTile;
    }

    public Tile[] getAllTiles() {
        ArrayList<Tile> list = new ArrayList<Tile>();
        for (Set sb : set)
            Collections.addAll(list, sb.getTiles());
        return list.toArray(new Tile[list.size()]);
    }
}
