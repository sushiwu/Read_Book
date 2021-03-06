package com.example.liuwen.two.Base;

import android.app.Application;
import android.widget.Button;
import android.widget.ListView;

import com.example.liuwen.two.Bean.Book;
import com.example.liuwen.two.engine.Downloader;
import com.example.liuwen.two.listener.EventListener;
import com.example.liuwen.two.utils.PromptDialogUtils;
import com.example.liuwen.two.utils.ThreadPoolUtils;

import java.io.File;
import java.util.List;

import GreenDao3.DaoManager;

/**
 * author : liuwen
 * e-mail : liuwen370494581@163.com
 * time   : 2018/11/08 14:08
 * desc   :
 */
public class AppInfo extends Application implements EventListener {

    private Book selectedBook = null;
    private Downloader downloader;

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化greenDao3
        DaoManager.init(this);
        ThreadPoolUtils.init();
    }

    @Override
    public void onChooseBook(List<Book> books) {

    }

    @Override
    public void pushMessage(String msg) {

    }

    @Override
    public void onDownload(int progress, String msg) {

    }

    @Override
    public void onEnd(String msg, File file) {

    }

    @Override
    public void onError(String msg, Exception e) {

    }
}
