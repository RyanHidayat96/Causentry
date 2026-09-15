package defpackage;

import android.content.Context;
import com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class MediaSpecOutputFormat implements Runnable {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private /* synthetic */ BaseDotsIndicator TuitionPaymentFragmentbindingInflater1;

    public /* synthetic */ MediaSpecOutputFormat(BaseDotsIndicator baseDotsIndicator) {
        this.TuitionPaymentFragmentbindingInflater1 = baseDotsIndicator;
    }

    public static int TuitionPaymentFragmentbindingInflater1() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = i % 5361784;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int layoutDirection = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().getLayoutDirection();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = layoutDirection;
        return layoutDirection;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        BaseDotsIndicator.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
    }
}
