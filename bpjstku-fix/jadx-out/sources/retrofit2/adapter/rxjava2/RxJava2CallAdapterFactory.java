package retrofit2.adapter.rxjava2;

import defpackage.VideoEncoderSession1;
import defpackage.VideoRecordEvent;
import defpackage.VideoRecordEventResume;
import defpackage.VideoRecordEventStart;
import defpackage.appendBackupVideoProfile;
import defpackage.deriveCodec;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import retrofit2.CallAdapter;
import retrofit2.Response;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes4.dex */
public final class RxJava2CallAdapterFactory extends CallAdapter.Factory {
    private final boolean isAsync;
    private final appendBackupVideoProfile scheduler;

    public static RxJava2CallAdapterFactory create() {
        return new RxJava2CallAdapterFactory(null, false);
    }

    public static RxJava2CallAdapterFactory createAsync() {
        return new RxJava2CallAdapterFactory(null, true);
    }

    public static RxJava2CallAdapterFactory createWithScheduler(appendBackupVideoProfile appendbackupvideoprofile) {
        if (appendbackupvideoprofile == null) {
            throw new NullPointerException("scheduler == null");
        }
        return new RxJava2CallAdapterFactory(appendbackupvideoprofile, false);
    }

    private RxJava2CallAdapterFactory(appendBackupVideoProfile appendbackupvideoprofile, boolean z) {
        this.scheduler = appendbackupvideoprofile;
        this.isAsync = z;
    }

    @Override // retrofit2.CallAdapter.Factory
    public final CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        Type parameterUpperBound;
        boolean z;
        boolean z2;
        String str;
        Class<?> rawType = getRawType(type);
        if (rawType == VideoEncoderSession1.class) {
            return new RxJava2CallAdapter(Void.class, this.scheduler, this.isAsync, false, true, false, false, false, true);
        }
        boolean z3 = rawType == VideoRecordEvent.class;
        boolean z4 = rawType == deriveCodec.class;
        boolean z5 = rawType == VideoRecordEventResume.class;
        if (rawType != VideoRecordEventStart.class && !z3 && !z4 && !z5) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            if (z3) {
                str = "Flowable";
            } else if (z4) {
                str = "Single";
            } else {
                str = z5 ? "Maybe" : "Observable";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" return type must be parameterized as ");
            sb.append(str);
            sb.append("<Foo> or ");
            sb.append(str);
            sb.append("<? extends Foo>");
            throw new IllegalStateException(sb.toString());
        }
        Type parameterUpperBound2 = getParameterUpperBound(0, (ParameterizedType) type);
        Class<?> rawType2 = getRawType(parameterUpperBound2);
        if (rawType2 == Response.class) {
            if (!(parameterUpperBound2 instanceof ParameterizedType)) {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
            parameterUpperBound = getParameterUpperBound(0, (ParameterizedType) parameterUpperBound2);
            z2 = false;
            z = false;
        } else if (rawType2 != Result.class) {
            parameterUpperBound = parameterUpperBound2;
            z = true;
            z2 = false;
        } else {
            if (!(parameterUpperBound2 instanceof ParameterizedType)) {
                throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            }
            parameterUpperBound = getParameterUpperBound(0, (ParameterizedType) parameterUpperBound2);
            z2 = true;
            z = false;
        }
        return new RxJava2CallAdapter(parameterUpperBound, this.scheduler, this.isAsync, z2, z, z3, z4, z5, false);
    }
}
