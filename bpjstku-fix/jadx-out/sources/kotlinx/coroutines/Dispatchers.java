package kotlinx.coroutines;

import defpackage.InputBufferImpl;
import defpackage.getHeightAlignment;
import defpackage.getTransfer;
import defpackage.resolveOutputBufferInfo;
import defpackage.setInputTimebase;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\f\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0011\u0010\u000f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\b"}, d2 = {"Lkotlinx/coroutines/Dispatchers;", "", "<init>", "()V", "Lkotlinx/coroutines/CoroutineDispatcher;", "b", "Lkotlinx/coroutines/CoroutineDispatcher;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Lkotlinx/coroutines/CoroutineDispatcher;", "LsetInputTimebase;", "TuitionPaymentFragmentbindingInflater1", "()LsetInputTimebase;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "getIO", "IO"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Dispatchers {
    public static final Dispatchers INSTANCE = new Dispatchers();
    private static final CoroutineDispatcher b = getHeightAlignment.INSTANCE;
    private static final CoroutineDispatcher TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getTransfer.TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    private Dispatchers() {
    }

    public static final CoroutineDispatcher TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return b;
    }

    public static final setInputTimebase TuitionPaymentFragmentbindingInflater1() {
        return resolveOutputBufferInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static final CoroutineDispatcher TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static final CoroutineDispatcher getIO() {
        return InputBufferImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }
}
