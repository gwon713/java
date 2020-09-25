package img_board;

import java.util.ArrayList;

import img_rep.ImgRep;

public class ImgBoard {
	private int num;
	private String writer;
	private String title;
	private String img;
	private ArrayList<ImgRep> reps;
	
	public ImgBoard() {
	}

	public ArrayList<ImgRep> getReps() {
		return reps;
	}

	public void setReps(ArrayList<ImgRep> reps) {
		this.reps = reps;
	}

	public ImgBoard(int num, String writer, String title, String img) {
		this.num = num;
		this.writer = writer;
		this.title = title;
		this.img = img;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "ImgBoard [num=" + num + ", writer=" + writer + ", title=" + title + ", img=" + img + "]";
	}

}
