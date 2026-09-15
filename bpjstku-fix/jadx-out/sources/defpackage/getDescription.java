package defpackage;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"LgetDescription;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "LwriteToParcel;", "TuitionPaymentFragmentbindingInflater1", "(Landroid/content/Context;)LwriteToParcel;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LwriteToParcel;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDescription {
    public static final getDescription INSTANCE = new getDescription();

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private static writeToParcel TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    private getDescription() {
    }

    @JvmStatic
    public static final writeToParcel TuitionPaymentFragmentbindingInflater1(Context p0) {
        writeToParcel writetoparcel = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        return writetoparcel == null ? INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0) : writetoparcel;
    }

    private final writeToParcel TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context p0) {
        synchronized (this) {
            writeToParcel writetoparcel = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (writetoparcel != null) {
                return writetoparcel;
            }
            Object applicationContext = p0.getApplicationContext();
            MediaBrowserCompatMediaItemFlags mediaBrowserCompatMediaItemFlags = applicationContext instanceof MediaBrowserCompatMediaItemFlags ? (MediaBrowserCompatMediaItemFlags) applicationContext : null;
            writeToParcel writetoparcelTuitionPaymentFragmentspecialinlinedviewModeldefault3 = mediaBrowserCompatMediaItemFlags != null ? mediaBrowserCompatMediaItemFlags.TuitionPaymentFragmentspecialinlinedviewModeldefault3() : new writeToParcel.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = writetoparcelTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            return writetoparcelTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
    }
}
