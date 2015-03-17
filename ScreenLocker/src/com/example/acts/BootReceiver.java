/**
 * 1，设置开机后要打开的服务的包名和类名（用Ctrl+F搜索"#"字符可快速定位）
 * 
 * 
 * **/

package com.example.acts;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

//开机启动
public class BootReceiver extends BroadcastReceiver{
	String myPkgName = "com.example.screenlocker";//#包
	String myActName = "com.example.acts.myService";//#类
	
	@Override
	public void onReceive(Context context, Intent intent) {
		//启动监听服务
		Intent myIntent=new Intent();
		myIntent.setAction(myPkgName+"."+myActName);
		context.startService(myIntent);	
	}
}
