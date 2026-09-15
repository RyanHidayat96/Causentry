package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.ResourcesCompat;
import coil.decode.DataSource;
import coil.size.Scale;
import com.google.android.gms.internal.mlkit_vision_face.zzbr;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0002\f\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"LMediaDescriptionCompatApi23;", "LsetMediaId;", "Landroid/net/Uri;", "p0", "LgetStarRating;", "p1", "<init>", "(Landroid/net/Uri;LgetStarRating;)V", "LsetMediaUri;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/net/Uri;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LgetStarRating;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MediaDescriptionCompatApi23 implements setMediaId {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final getStarRating TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Uri b;

    public MediaDescriptionCompatApi23(Uri uri, getStarRating getstarrating) {
        this.b = uri;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getstarrating;
    }

    @Override // defpackage.setMediaId
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Continuation<? super setMediaUri> continuation) throws XmlPullParserException, PackageManager.NameNotFoundException {
        Integer intOrNull;
        Resources resourcesForApplication;
        BitmapDrawable drawable;
        String authority = this.b.getAuthority();
        if (authority != null) {
            if (StringsKt.isBlank(authority)) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) CollectionsKt.lastOrNull((List) this.b.getPathSegments());
                if (str != null && (intOrNull = StringsKt.toIntOrNull(str)) != null) {
                    int iIntValue = intOrNull.intValue();
                    Context contextTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    if (Intrinsics.areEqual(authority, contextTuitionPaymentFragmentspecialinlinedviewModeldefault2.getPackageName())) {
                        resourcesForApplication = contextTuitionPaymentFragmentspecialinlinedviewModeldefault2.getResources();
                    } else {
                        resourcesForApplication = contextTuitionPaymentFragmentspecialinlinedviewModeldefault2.getPackageManager().getResourcesForApplication(authority);
                    }
                    TypedValue typedValue = new TypedValue();
                    resourcesForApplication.getValue(iIntValue, typedValue, true);
                    CharSequence charSequence = typedValue.string;
                    String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getRatingType.TuitionPaymentFragmentspecialinlinedviewModeldefault2(MimeTypeMap.getSingleton(), charSequence.subSequence(StringsKt.lastIndexOf$default(charSequence, '/', 0, false, 6, (Object) null), charSequence.length()).toString());
                    if (Intrinsics.areEqual(strTuitionPaymentFragmentspecialinlinedviewModeldefault2, "text/xml")) {
                        if (Intrinsics.areEqual(authority, contextTuitionPaymentFragmentspecialinlinedviewModeldefault2.getPackageName())) {
                            drawable = AppCompatResources.getDrawable(contextTuitionPaymentFragmentspecialinlinedviewModeldefault2, iIntValue);
                            if (drawable == null) {
                                throw new IllegalStateException("Invalid resource ID: ".concat(String.valueOf(iIntValue)).toString());
                            }
                        } else {
                            XmlResourceParser xml = resourcesForApplication.getXml(iIntValue);
                            int next = xml.next();
                            while (next != 2 && next != 1) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found.");
                            }
                            drawable = ResourcesCompat.getDrawable(resourcesForApplication, iIntValue, contextTuitionPaymentFragmentspecialinlinedviewModeldefault2.getTheme());
                            if (drawable == null) {
                                throw new IllegalStateException("Invalid resource ID: ".concat(String.valueOf(iIntValue)).toString());
                            }
                        }
                        boolean zB = getRatingType.b(drawable);
                        if (zB) {
                            getRepeatMode getrepeatmode = getRepeatMode.INSTANCE;
                            Bitmap.Config configTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            onQueueTitleChanged onqueuetitlechangedCancel = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancel();
                            Scale scaleCancelAll = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancelAll();
                            Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault3};
                            drawable = new BitmapDrawable(contextTuitionPaymentFragmentspecialinlinedviewModeldefault2.getResources(), getRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(drawable, configTuitionPaymentFragmentspecialinlinedviewModeldefault3, onqueuetitlechangedCancel, scaleCancelAll, ((Boolean) getStarRating.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1007128350, zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1007128351, objArr, zzbr.TuitionPaymentFragmentspecialinlinedviewModeldefault3())).booleanValue()));
                        }
                        return new setTitle(drawable, zB, DataSource.DISK);
                    }
                    TypedValue typedValue2 = new TypedValue();
                    return new MediaDescriptionCompatApi21Builder(new MediaBrowserCompatApi26SubscriptionCallbackProxy(SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault2(resourcesForApplication.openRawResource(iIntValue, typedValue2))), new createItemCallback(contextTuitionPaymentFragmentspecialinlinedviewModeldefault2), new getIconBitmap(authority, iIntValue, typedValue2.density)), strTuitionPaymentFragmentspecialinlinedviewModeldefault2, DataSource.DISK);
                }
                throw new IllegalStateException("Invalid android.resource URI: ".concat(String.valueOf(this.b)));
            }
        }
        throw new IllegalStateException("Invalid android.resource URI: ".concat(String.valueOf(this.b)));
    }

    public static final class b implements setMediaId.TuitionPaymentFragmentspecialinlinedviewModeldefault1<Uri> {
        @Override // setMediaId.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final /* synthetic */ setMediaId TuitionPaymentFragmentspecialinlinedviewModeldefault2(Uri uri, getStarRating getstarrating) {
            Uri uri2 = uri;
            if (Intrinsics.areEqual(uri2.getScheme(), "android.resource")) {
                return new MediaDescriptionCompatApi23(uri2, getstarrating);
            }
            return null;
        }
    }
}
