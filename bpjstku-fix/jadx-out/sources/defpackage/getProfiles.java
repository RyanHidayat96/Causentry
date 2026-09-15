package defpackage;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.squareup.picasso.Picasso;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class getProfiles extends FileOutputOptions {
    public final Context TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public getProfiles(Context context) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = context;
    }

    @Override // defpackage.FileOutputOptions
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder) {
        return FirebaseAnalytics.Param.CONTENT.equals(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault.getScheme());
    }

    @Override // defpackage.FileOutputOptions
    public FileOutputOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2(FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder, int i) throws IOException {
        return new FileOutputOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getContentResolver().openInputStream(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault)), Picasso.LoadedFrom.DISK);
    }
}
