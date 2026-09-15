package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import com.squareup.picasso.Picasso;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder {
    private static final long read = TimeUnit.SECONDS.toNanos(5);
    public final float INotificationSideChannel;
    public final Uri INotificationSideChannelDefault;
    public long INotificationSideChannelStub;
    public final List<outputFormatToAudioMime> INotificationSideChannelStubProxy;
    public final int RemoteActionCompatParcelizer;
    public final Bitmap.Config TuitionPaymentFragmentbindingInflater1;
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f141a;
    public final Picasso.Priority asBinder;
    public final boolean asInterface;
    public final int b;
    public final int cancel;
    public final String cancelAll;
    public int d;
    public final boolean g;
    public final int getInterfaceDescriptor;
    public final float notify;
    public final float onTransact;

    public /* synthetic */ FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder(Uri uri, int i, String str, List list, int i2, int i3, boolean z, boolean z2, int i4, boolean z3, float f, float f2, float f3, boolean z4, boolean z5, Bitmap.Config config, Picasso.Priority priority, byte b) {
        this(uri, i, str, list, i2, i3, z, z2, i4, z3, f, f2, f3, z4, z5, config, priority);
    }

    private FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder(Uri uri, int i, String str, List<outputFormatToAudioMime> list, int i2, int i3, boolean z, boolean z2, int i4, boolean z3, float f, float f2, float f3, boolean z4, boolean z5, Bitmap.Config config, Picasso.Priority priority) {
        this.INotificationSideChannelDefault = uri;
        this.cancel = i;
        this.cancelAll = str;
        if (list == null) {
            this.INotificationSideChannelStubProxy = null;
        } else {
            this.INotificationSideChannelStubProxy = Collections.unmodifiableList(list);
        }
        this.RemoteActionCompatParcelizer = i2;
        this.getInterfaceDescriptor = i3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z2;
        this.b = i4;
        this.asInterface = z3;
        this.INotificationSideChannel = f;
        this.onTransact = f2;
        this.notify = f3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z4;
        this.g = z5;
        this.TuitionPaymentFragmentbindingInflater1 = config;
        this.asBinder = priority;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i = this.cancel;
        if (i > 0) {
            sb.append(i);
        } else {
            sb.append(this.INotificationSideChannelDefault);
        }
        List<outputFormatToAudioMime> list = this.INotificationSideChannelStubProxy;
        if (list != null && !list.isEmpty()) {
            for (outputFormatToAudioMime outputformattoaudiomime : this.INotificationSideChannelStubProxy) {
                sb.append(' ');
                sb.append(outputformattoaudiomime.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            }
        }
        if (this.cancelAll != null) {
            sb.append(" stableKey(");
            sb.append(this.cancelAll);
            sb.append(')');
        }
        if (this.RemoteActionCompatParcelizer > 0) {
            sb.append(" resize(");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(',');
            sb.append(this.getInterfaceDescriptor);
            sb.append(')');
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            sb.append(" centerCrop");
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            sb.append(" centerInside");
        }
        if (this.INotificationSideChannel != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.INotificationSideChannel);
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                sb.append(" @ ");
                sb.append(this.onTransact);
                sb.append(',');
                sb.append(this.notify);
            }
            sb.append(')');
        }
        if (this.g) {
            sb.append(" purgeable");
        }
        if (this.TuitionPaymentFragmentbindingInflater1 != null) {
            sb.append(' ');
            sb.append(this.TuitionPaymentFragmentbindingInflater1);
        }
        sb.append('}');
        return sb.toString();
    }

    public final String b() {
        long jNanoTime = System.nanoTime() - this.INotificationSideChannelStub;
        if (jNanoTime > read) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder("[R");
            sb2.append(this.d);
            sb2.append(']');
            sb.append(sb2.toString());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toSeconds(jNanoTime));
            sb.append('s');
            return sb.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder("[R");
        sb4.append(this.d);
        sb4.append(']');
        sb3.append(sb4.toString());
        sb3.append('+');
        sb3.append(TimeUnit.NANOSECONDS.toMillis(jNanoTime));
        sb3.append("ms");
        return sb3.toString();
    }

    public static final class TuitionPaymentFragmentbindingInflater1 {
        public int INotificationSideChannel;
        public Uri INotificationSideChannelStubProxy;
        public List<outputFormatToAudioMime> RemoteActionCompatParcelizer;
        public int TuitionPaymentFragmentbindingInflater1;
        public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f142a;
        public float asBinder;
        public Picasso.Priority asInterface;
        public Bitmap.Config b;
        public String cancel;
        public float cancelAll;
        public int d = 0;
        public boolean g;
        public float notify;
        public int onTransact;

        TuitionPaymentFragmentbindingInflater1(Uri uri, int i, Bitmap.Config config) {
            this.INotificationSideChannelStubProxy = uri;
            this.b = config;
        }
    }
}
