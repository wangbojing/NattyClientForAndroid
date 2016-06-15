/*
 *  Author : WangBoJing , email : 1989wangbojing@gmail.com
 * 
 *  Copyright Statement:
 *  --------------------
 *  This software is protected by Copyright and the information contained
 *  herein is confidential. The software may not be copied and the information
 *  contained herein may not be used or disclosed except with the written
 *  permission of Author. (C) 2016
 * 
 *
 
****       *****
  ***        *
  ***        *                         *               *
  * **       *                         *               *
  * **       *                         *               *
  *  **      *                        **              **
  *  **      *                       ***             ***
  *   **     *       ******       ***********     ***********    *****    *****
  *   **     *     **     **          **              **           **      **
  *    **    *    **       **         **              **           **      *
  *    **    *    **       **         **              **            *      *
  *     **   *    **       **         **              **            **     *
  *     **   *            ***         **              **             *    *
  *      **  *       ***** **         **              **             **   *
  *      **  *     ***     **         **              **             **   *
  *       ** *    **       **         **              **              *  *
  *       ** *   **        **         **              **              ** *
  *        ***   **        **         **              **               * *
  *        ***   **        **         **     *        **     *         **
  *         **   **        **  *      **     *        **     *         **
  *         **    **     ****  *       **   *          **   *          *
*****        *     ******   ***         ****            ****           *
                                                                       *
                                                                      *
                                                                  *****
                                                                  ****


 *
 */


package com.wbj.ndk.natty.client;

import android.util.Log;

public class NattyClient {
	static {
		System.loadLibrary("natty-client");
	}
	public native String stringFromJNI();
	public native int add(int a, int b);
	
//	public native void nativeInitilize();
//	public native void nativeThreadStop();
//	public native void nativeThreadStart();
	

	public native byte[] getNativeBuffer();
	public native int getBufferSize();
	
	public native void ntyClientInitilize();
	public native void setNattyDevId(byte[] DevId);
	
	public void onNativeCallback(int count)  {
		Log.i("Native", " aaa onNativeCallback count = " + count);
	}
	
	public void onNativeUserRecvCallback(int len) {
		byte[] buffer = getNativeBuffer();
		
		for (int i = 0;i < len;i ++) {
			Log.i("Native", " aaa buffer["+i+"] : " + buffer[i]);
		}
	}
	
	public void onNativeSendSuccess(int arg) {
		
	}
	
	public void onNativeSendFailed(int arg) {
		
	}
}
