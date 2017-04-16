package com.github.zjiajun.adult.downloader;

import com.github.zjiajun.adult.manager.Scheduler;
import com.github.zjiajun.adult.request.Request;

/**
 * @author zhujiajun
 * @since 2017/4/14
 */
public class DefaultDownloader extends AbstractDownloader {

    private final int threadCount;
    private final Thread [] downloadThread;


    public DefaultDownloader(Scheduler scheduler) {
        this(scheduler,1);
    }

    public DefaultDownloader(Scheduler scheduler, int threadCount) {
        super(scheduler);
        this.threadCount = threadCount;
        downloadThread = new Thread[threadCount];
        for (int i = 0; i < threadCount; i++) {
            downloadThread[i] = new Thread(DefaultDownloader.super::download);
        }
    }

    @Override
    protected void beforeDownload(Request request) {

    }

    @Override
    protected void afterDownload(Object response) {

    }
}
