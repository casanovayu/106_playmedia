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

	//�����ť  ����һ����Ƶ�ļ�
	public void click(View v){
		//[1]��ʼ��mediaplayer
		MediaPlayer mediaPlayer=new MediaPlayer();
		//[2]����Ҫ���ŵ���Դλ��  path  ����������·��Ҳ�����Ǳ���·��
		try {
			mediaPlayer.setDataSource("/data/data/Magic_Mullet.mp3");
			//[3]׼������
			mediaPlayer.prepare();
			//[4]��ʼ����
			mediaPlayer.start();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
}
