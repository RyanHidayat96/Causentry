package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import coil.decode.DataSource;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class setIconBitmap implements setMediaId {
    private final getStarRating TuitionPaymentFragmentbindingInflater1;
    private final Uri TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public setIconBitmap(Uri uri, getStarRating getstarrating) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = uri;
        this.TuitionPaymentFragmentbindingInflater1 = getstarrating;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:46:0x0108  */
    /* JADX WARN: Code duplicated, block: B:50:0x0141  */
    @Override // defpackage.setMediaId
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Continuation<? super setMediaUri> continuation) throws FileNotFoundException {
        FileInputStream fileInputStreamOpenInputStream;
        List<String> pathSegments;
        int size;
        Bundle bundle;
        FileInputStream fileInputStreamCreateInputStream;
        ContentResolver contentResolver = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getContentResolver();
        Uri uri = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (Intrinsics.areEqual(uri.getAuthority(), "com.android.contacts") && Intrinsics.areEqual(uri.getLastPathSegment(), "display_photo")) {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, "r");
            fileInputStreamCreateInputStream = assetFileDescriptorOpenAssetFileDescriptor != null ? assetFileDescriptorOpenAssetFileDescriptor.createInputStream() : null;
            if (fileInputStreamCreateInputStream == null) {
                StringBuilder sb = new StringBuilder("Unable to find a contact photo associated with '");
                sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                sb.append("'.");
                throw new IllegalStateException(sb.toString().toString());
            }
            fileInputStreamOpenInputStream = fileInputStreamCreateInputStream;
        } else if (Build.VERSION.SDK_INT < 29) {
            fileInputStreamOpenInputStream = contentResolver.openInputStream(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            if (fileInputStreamOpenInputStream == null) {
                StringBuilder sb2 = new StringBuilder("Unable to open '");
                sb2.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                sb2.append("'.");
                throw new IllegalStateException(sb2.toString().toString());
            }
        } else {
            Uri uri2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (!Intrinsics.areEqual(uri2.getAuthority(), "media") || (size = (pathSegments = uri2.getPathSegments()).size()) < 3 || !Intrinsics.areEqual(pathSegments.get(size - 3), "audio") || !Intrinsics.areEqual(pathSegments.get(size - 2), "albums")) {
                fileInputStreamOpenInputStream = contentResolver.openInputStream(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                if (fileInputStreamOpenInputStream == null) {
                    StringBuilder sb3 = new StringBuilder("Unable to open '");
                    sb3.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    sb3.append("'.");
                    throw new IllegalStateException(sb3.toString().toString());
                }
            } else {
                onEvent tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentbindingInflater1.cancel().getTuitionPaymentFragmentspecialinlinedviewModeldefault1();
                onEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault1 instanceof onEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ? (onEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3) tuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                    int i = tuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
                    onEvent tuitionPaymentFragmentspecialinlinedviewModeldefault4 = this.TuitionPaymentFragmentbindingInflater1.cancel().getTuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    onEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault5 = tuitionPaymentFragmentspecialinlinedviewModeldefault4 instanceof onEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ? (onEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3) tuitionPaymentFragmentspecialinlinedviewModeldefault4 : null;
                    if (tuitionPaymentFragmentspecialinlinedviewModeldefault5 != null) {
                        int i2 = tuitionPaymentFragmentspecialinlinedviewModeldefault5.b;
                        bundle = new Bundle(1);
                        bundle.putParcelable("android.content.extra.SIZE", new Point(i, i2));
                    } else {
                        bundle = null;
                    }
                } else {
                    bundle = null;
                }
                AssetFileDescriptor assetFileDescriptorOpenTypedAssetFile = contentResolver.openTypedAssetFile(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, "image/*", bundle, null);
                fileInputStreamCreateInputStream = assetFileDescriptorOpenTypedAssetFile != null ? assetFileDescriptorOpenTypedAssetFile.createInputStream() : null;
                if (fileInputStreamCreateInputStream == null) {
                    StringBuilder sb4 = new StringBuilder("Unable to find a music thumbnail associated with '");
                    sb4.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    sb4.append("'.");
                    throw new IllegalStateException(sb4.toString().toString());
                }
                fileInputStreamOpenInputStream = fileInputStreamCreateInputStream;
            }
        }
        return new MediaDescriptionCompatApi21Builder(new MediaBrowserCompatApi26SubscriptionCallbackProxy(SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fileInputStreamOpenInputStream)), new createItemCallback(this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2()), new MediaBrowserCompatApi21ConnectionCallback(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3)), contentResolver.getType(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3), DataSource.DISK);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements setMediaId.TuitionPaymentFragmentspecialinlinedviewModeldefault1<Uri> {
        @Override // setMediaId.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final /* synthetic */ setMediaId TuitionPaymentFragmentspecialinlinedviewModeldefault2(Uri uri, getStarRating getstarrating) {
            Uri uri2 = uri;
            if (Intrinsics.areEqual(uri2.getScheme(), FirebaseAnalytics.Param.CONTENT)) {
                return new setIconBitmap(uri2, getstarrating);
            }
            return null;
        }
    }
}
