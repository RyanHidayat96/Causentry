package com.bumptech.glide.load;

import android.content.Context;
import com.bumptech.glide.load.engine.Resource;
import defpackage.getCameraControl;

/* JADX INFO: loaded from: classes3.dex */
public interface Transformation<T> extends getCameraControl {
    Resource<T> transform(Context context, Resource<T> resource, int i, int i2);
}
