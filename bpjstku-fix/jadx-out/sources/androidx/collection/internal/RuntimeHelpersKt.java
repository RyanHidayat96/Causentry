package androidx.collection.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a4\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a4\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001¢\u0006\u0004\b\b\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\n\u001a\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\r\u0010\n\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"", "p0", "Lkotlin/Function0;", "", "p1", "", "checkPrecondition", "(ZLkotlin/jvm/functions/Function0;)V", "requirePrecondition", "throwIllegalArgumentException", "(Ljava/lang/String;)V", "throwIllegalStateException", "throwIndexOutOfBoundsException", "throwNoSuchElementException", "", "throwNoSuchElementExceptionForInline", "(Ljava/lang/String;)Ljava/lang/Void;"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RuntimeHelpersKt {
    public static final void throwIllegalStateException(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        throw new IllegalStateException(str);
    }

    public static final void throwIndexOutOfBoundsException(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        throw new IndexOutOfBoundsException(str);
    }

    public static final void throwNoSuchElementException(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        throw new NoSuchElementException(str);
    }

    public static final Void throwNoSuchElementExceptionForInline(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        throw new NoSuchElementException(str);
    }

    public static final void checkPrecondition(boolean z, Function0<String> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        if (z) {
            return;
        }
        throwIllegalStateException(function0.invoke());
    }

    public static final void throwIllegalArgumentException(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        throw new IllegalArgumentException(str);
    }

    public static final void requirePrecondition(boolean z, Function0<String> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        if (z) {
            return;
        }
        throwIllegalArgumentException(function0.invoke());
    }
}
