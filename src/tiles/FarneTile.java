package tiles;

import gfx.Assets;

public class FarneTile extends Tile {

    public FarneTile(int id){
        super(Assets.farne, id);
    }

    @Override
    public String toString(){
        return "Farne";
    }
}
