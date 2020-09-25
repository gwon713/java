package img_rep;

import java.util.ArrayList;


public interface Dao {
	void insert(ImgRep ir);
	ArrayList<ImgRep> selectAll(int img_num);
}
