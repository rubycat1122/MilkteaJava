package com.milktea.day2x.music.medel.vo;

import java.util.Comparator;

public class AscSinger implements Comparator<Music>{
	@Override
	public int compare(Music o1, Music o2) {
		return o1.getSinger().compareTo(o2.getSinger());
	}
	
}
