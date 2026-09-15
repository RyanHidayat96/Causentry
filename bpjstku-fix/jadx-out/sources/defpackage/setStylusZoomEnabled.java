package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Reflection;
import org.koin.android.error.MissingAndroidContextException;

/* JADX INFO: loaded from: classes4.dex */
public final class setStylusZoomEnabled {
    public static final Context TuitionPaymentFragmentspecialinlinedviewModeldefault3(FileTransformFactory fileTransformFactory) {
        try {
            return (Context) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(Context.class), null, null);
        } catch (Exception unused) {
            throw new MissingAndroidContextException("Can't resolve Context instance. Please use androidContext() function in your KoinApplication configuration.");
        }
    }
}
