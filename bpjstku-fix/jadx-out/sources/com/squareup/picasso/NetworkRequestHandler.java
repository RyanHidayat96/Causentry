package com.squareup.picasso;

import android.net.NetworkInfo;
import android.os.Handler;
import defpackage.FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder;
import defpackage.FileOutputOptions;
import defpackage.FileOutputOptionsBuilder;
import defpackage.higherQualityOrLowerThan;
import java.io.IOException;
import okhttp3.CacheControl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
public final class NetworkRequestHandler extends FileOutputOptions {
    private final higherQualityOrLowerThan TuitionPaymentFragmentbindingInflater1;
    private final FileOutputOptionsBuilder b;

    @Override // defpackage.FileOutputOptions
    public final int TuitionPaymentFragmentbindingInflater1() {
        return 2;
    }

    @Override // defpackage.FileOutputOptions
    public final boolean b() {
        return true;
    }

    NetworkRequestHandler(higherQualityOrLowerThan higherqualityorlowerthan, FileOutputOptionsBuilder fileOutputOptionsBuilder) {
        this.TuitionPaymentFragmentbindingInflater1 = higherqualityorlowerthan;
        this.b = fileOutputOptionsBuilder;
    }

    @Override // defpackage.FileOutputOptions
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder) {
        String scheme = fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    @Override // defpackage.FileOutputOptions
    public final boolean b(NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    public static class ContentLengthException extends IOException {
        public ContentLengthException(String str) {
            super(str);
        }
    }

    public static final class ResponseException extends IOException {
        public final int code;
        public final int networkPolicy;

        ResponseException(int i, int i2) {
            super("HTTP ".concat(String.valueOf(i)));
            this.code = i;
            this.networkPolicy = i2;
        }
    }

    @Override // defpackage.FileOutputOptions
    public final FileOutputOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2(FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder, int i) throws IOException {
        CacheControl cacheControlBuild;
        if (i == 0) {
            cacheControlBuild = null;
        } else if (NetworkPolicy.TuitionPaymentFragmentbindingInflater1(i)) {
            cacheControlBuild = CacheControl.FORCE_CACHE;
        } else {
            CacheControl.Builder builder = new CacheControl.Builder();
            if (!NetworkPolicy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i)) {
                builder.noCache();
            }
            if (!NetworkPolicy.b(i)) {
                builder.noStore();
            }
            cacheControlBuild = builder.build();
        }
        Request.Builder builderUrl = new Request.Builder().url(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault.toString());
        if (cacheControlBuild != null) {
            builderUrl.cacheControl(cacheControlBuild);
        }
        Response responseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(builderUrl.build());
        ResponseBody responseBodyBody = responseTuitionPaymentFragmentspecialinlinedviewModeldefault3.body();
        if (!responseTuitionPaymentFragmentspecialinlinedviewModeldefault3.isSuccessful()) {
            responseBodyBody.close();
            throw new ResponseException(responseTuitionPaymentFragmentspecialinlinedviewModeldefault3.code(), fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.f141a);
        }
        Picasso.LoadedFrom loadedFrom = responseTuitionPaymentFragmentspecialinlinedviewModeldefault3.cacheResponse() == null ? Picasso.LoadedFrom.NETWORK : Picasso.LoadedFrom.DISK;
        if (loadedFrom == Picasso.LoadedFrom.DISK && responseBodyBody.getContentLength() == 0) {
            responseBodyBody.close();
            throw new ContentLengthException("Received response with 0 content-length header.");
        }
        if (loadedFrom == Picasso.LoadedFrom.NETWORK && responseBodyBody.getContentLength() > 0) {
            FileOutputOptionsBuilder fileOutputOptionsBuilder = this.b;
            long jContentLength = responseBodyBody.getContentLength();
            Handler handler = fileOutputOptionsBuilder.asBinder;
            handler.sendMessage(handler.obtainMessage(4, Long.valueOf(jContentLength)));
        }
        return new FileOutputOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(responseBodyBody.getSource(), loadedFrom);
    }
}
