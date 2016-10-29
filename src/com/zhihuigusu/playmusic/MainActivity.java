package com.zhihuigusu.playmusic;

import java.io.IOException;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	//点击按钮  播放一个音频文件
	public void click(View v){
		//[1]初始化mediaplayer
		MediaPlayer mediaPlayer=new MediaPlayer();
		//[2]设置要播放的资源位置  path  可以是网络路径也可以是本地路径
		try {
			mediaPlayer.setDataSource("/data/data/Magic_Mullet.mp3");
			//[3]准备播放
			mediaPlayer.prepare();
			//[4]开始播放
			mediaPlayer.start();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
}
