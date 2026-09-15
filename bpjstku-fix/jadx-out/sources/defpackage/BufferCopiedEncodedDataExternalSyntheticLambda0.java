package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0004\u0010\b\"\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroid/os/Handler;", "", "p0", "LgetPresentationTimeUs;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/os/Handler;Ljava/lang/String;)LgetPresentationTimeUs;", "Landroid/os/Looper;", "", "(Landroid/os/Looper;)Landroid/os/Handler;", "Landroid/view/Choreographer;", "choreographer", "Landroid/view/Choreographer;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BufferCopiedEncodedDataExternalSyntheticLambda0 {
    private static volatile Choreographer choreographer;

    public static final getPresentationTimeUs TuitionPaymentFragmentspecialinlinedviewModeldefault3(Handler handler, String str) {
        return new EncodeException(handler, str);
    }

    public static final Handler TuitionPaymentFragmentspecialinlinedviewModeldefault3(Looper looper) throws IllegalAccessException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            Intrinsics.checkNotNull(objInvoke, "");
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object objM8024constructorimpl;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM8024constructorimpl = Result.m8024constructorimpl(new EncodeException(TuitionPaymentFragmentspecialinlinedviewModeldefault3(Looper.getMainLooper()), objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8024constructorimpl = Result.m8024constructorimpl(ResultKt.createFailure(th));
        }
    }
}
