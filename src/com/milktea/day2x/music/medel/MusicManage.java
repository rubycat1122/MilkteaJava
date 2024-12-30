package com.milktea.day2x.music.medel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.milktea.day2x.music.medel.vo.AscSinger;
import com.milktea.day2x.music.medel.vo.DescSinger;
import com.milktea.day2x.music.medel.vo.DescTitle;
import com.milktea.day2x.music.medel.vo.Music;

public class MusicManage {
	// TODO 데이터의 최종 저장소가 존재
	List<Music> mList;
	
	public MusicManage() {
		this.mList = new ArrayList<Music>();
	}
	// 마지막 위치에 음악 등록
	public void registerMusic(Music music) {
		mList.add(music);
	}
	// 첫 위치에 음악 등록
	public void registerMusicAtFirst(Music music) {
		mList.add(0, music);
	}
	// 곡 정보 수정
	public void modifyMusic(int index, Music music) {
		mList.set(index, music); 
	}
	// 객체를 넘겨받아 mList에서 제거(삭제 기능)
	public void deleteMusic(Music music) {
		mList.remove(music);
	}
	// 모든 음악 가져오기
	public List<Music> getAllMusic() {
		return mList;
	}
	// 곡명으로 음악 찾기
	public Music searchMusicByTitle(String title) {
		if(!"".equals(title) && title != null) {
			for(Music music: mList) {
				if(title.equals(music.getTitle())) {
					return music;
				}
			}
		}
		return null;
	}

	// 곡명으로 인덱스 값 찾기(수정에서 사용됨)
	public int searchIndexByTitle(String title) {
		if(!"".equals(title) && title != null) {
			for(int i = 0; i< mList.size(); i++){
				if(title.equals(mList.get(i).getTitle())){
					return i;
				}
			}
		}
		return -1;
	}
	// 곡명 오름차순 정렬
	public void sortByTitleASC() {
		/*
		 * 정렬하는 방법
		 * 1. 알고리즘 사용하기
		 * 2. Collections 클래스 사용하기
		 */
		Collections.sort(mList);
	}
	// 곡명 내림차순 정렬
	public void sortByTitleDESC() {
		Collections.sort(mList, new DescTitle());
	}
	// 가수명 오름차순 정렬
	public void sortBySingerASC() {
		Collections.sort(mList, new AscSinger());
	}
	// 가수명 내림차순 정렬
	public void sortBySingerDESC() {
		Collections.sort(mList, new DescSinger());
	}
	
}
