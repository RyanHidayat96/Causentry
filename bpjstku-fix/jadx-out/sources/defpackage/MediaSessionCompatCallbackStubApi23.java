package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0011\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0014R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0016\u0010\n\u001a\u00020\f8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001b"}, d2 = {"LMediaSessionCompatCallbackStubApi23;", "", "Landroid/app/Activity;", "p0", "<init>", "(Landroid/app/Activity;)V", "Landroid/content/Context;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/content/Context;)Landroid/content/Context;", "Ljava/util/Locale;", "p1", "", "b", "(Ljava/util/Locale;Ljava/util/Locale;)Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()V", "Landroid/content/res/Configuration;", "(Landroid/content/Context;)Landroid/content/res/Configuration;", "Landroid/app/Activity;", "TuitionPaymentFragmentbindingInflater1", "Ljava/util/Locale;", "Z", "Ljava/util/ArrayList;", "LsetCurrentControllerInfo;", "Ljava/util/ArrayList;"}, k = 1, mv = {1, 4, 2})
public class MediaSessionCompatCallbackStubApi23 {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public Locale TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final Activity b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final ArrayList<setCurrentControllerInfo> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public MediaSessionCompatCallbackStubApi23(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.b = activity;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayList<>();
    }

    public static Configuration TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        getRccTransportControlFlagsFromActions getrcctransportcontrolflagsfromactions = getRccTransportControlFlagsFromActions.INSTANCE;
        Resources resources = p0.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        return getRccTransportControlFlagsFromActions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0, configuration).getFirst();
    }

    public static Context TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return getRccTransportControlFlagsFromActions.INSTANCE.b(p0);
    }

    public static boolean b(Locale p0, Locale p1) {
        return Intrinsics.areEqual(p0.toString(), p1.toString());
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0) {
        Locale localeTuitionPaymentFragmentspecialinlinedviewModeldefault1 = MediaSessionCompatCallbackStubApi21.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, MediaSessionCompatCallbackStubApi21.b(p0));
        Locale locale = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (locale == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (Intrinsics.areEqual(locale.toString(), localeTuitionPaymentFragmentspecialinlinedviewModeldefault1.toString())) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(MediaSessionCompatCallbackStubApi23 mediaSessionCompatCallbackStubApi23) {
        if (mediaSessionCompatCallbackStubApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            for (setCurrentControllerInfo setcurrentcontrollerinfo : mediaSessionCompatCallbackStubApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            }
            mediaSessionCompatCallbackStubApi23.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        for (setCurrentControllerInfo setcurrentcontrollerinfo : this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
        }
        if (this.b.getIntent() == null) {
            this.b.setIntent(new Intent());
        }
        this.b.getIntent().putExtra("activity_locale_changed", true);
        this.b.recreate();
    }
}
