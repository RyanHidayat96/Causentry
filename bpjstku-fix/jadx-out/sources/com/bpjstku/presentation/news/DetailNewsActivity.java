package com.bpjstku.presentation.news;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityDetailNewsBinding;
import com.bpjstku.domain.news.model.News;
import com.bpjstku.presentation.news.DetailNewsActivity;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.material.button.MaterialButton;
import defpackage.CameraUseCaseAdapter;
import defpackage.DecorContentParent;
import defpackage.LifecycleCameraRepositoryKey;
import defpackage.TargetAspectRatio;
import defpackage.TrustedWebUtils;
import defpackage.ViewPortBuilder;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.getAudioCodecMimeType;
import defpackage.getConcurrentCameraSelectors;
import defpackage.getIncrementalScaleFactor;
import defpackage.getMatrix;
import defpackage.initSession;
import defpackage.isAssociatedWith;
import defpackage.lambdacreateCameraSelectorById0;
import defpackage.onCaptureSessionEnd;
import defpackage.setAspectRatio;
import defpackage.setSessionStateCallback;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00118\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0015\u0010\u0012\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00020\u001c8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001eR\u001a\u0010 \u001a\u00020\u00118\u0015X\u0095D¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0012\u0010\u001f"}, d2 = {"Lcom/bpjstku/presentation/news/DetailNewsActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityDetailNewsBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "a", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "I", "Ljava/util/ArrayList;", "Lcom/bpjstku/domain/news/model/News;", "Lkotlin/collections/b;", "Ljava/util/ArrayList;", "Lcom/bpjstku/domain/news/model/News;", "LTrustedWebUtils;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Lazy;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "()I", "g"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DetailNewsActivity extends BindingBaseActivity<ActivityDetailNewsBinding> {
    private static int INotificationSideChannel;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f571a;
    private static char asInterface;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char d;
    private static char g;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private News TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {93, -122, -23, -24};
    private static final int $$f = 3;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {36, -74, -79, -21, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 236;
    private static int onTransact = 0;
    private static int cancel = 0;
    private static int notify = 1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final int b = 2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final ArrayList<News> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayList<>();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: CustomTabsSessionToken1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DetailNewsActivity.TuitionPaymentFragmentbindingInflater1(this.b);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final int g = R.layout.activity_detail_news;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i5)) | i9 | (~(i8 | i5));
        int i11 = ~i5;
        int i12 = (~(i11 | i8 | i4)) | (~(i7 | i11 | i));
        int i13 = i4 + i + i6 + ((-195996979) * i3) + ((-904719387) * i2);
        int i14 = i13 * i13;
        int i15 = (i4 * 1886715248) + 940376064 + (1886715248 * i) + (i10 * (-42925423)) + (i9 * (-42925423)) + ((-42925423) * i12) + (1843789824 * i6) + ((-1389494272) * i3) + (1623064576 * i2) + (1510801408 * i14);
        int i16 = (i4 * 1590984816) + 1398186415 + (i * 1590984816) + (i10 * 737) + (i9 * 737) + (i12 * 737) + (i6 * 1590985553) + (i3 * (-1025631779)) + (i2 * 1121679989) + (i14 * 622657536);
        int i17 = i15 + (i16 * i16 * (-1928134656));
        if (i17 == 1) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i17 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        DetailNewsActivity detailNewsActivity = (DetailNewsActivity) objArr[0];
        int i18 = 2 % 2;
        int i19 = cancel + 111;
        int i20 = i19 % 128;
        notify = i20;
        int i21 = i19 % 2;
        int i22 = detailNewsActivity.g;
        int i23 = i20 + 103;
        cancel = i23 % 128;
        int i24 = i23 % 2;
        return Integer.valueOf(i22);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = 53 - r8
            int r6 = r6 * 14
            int r6 = 98 - r6
            byte[] r0 = com.bpjstku.presentation.news.DetailNewsActivity.$$a
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.news.DetailNewsActivity.c(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.news.DetailNewsActivity$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/bpjstku/presentation/news/DetailNewsActivity$b;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Ljava/util/ArrayList;", "Lcom/bpjstku/domain/news/model/News;", "Lkotlin/collections/b;", "p1", "p2", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/content/Context;Ljava/util/ArrayList;Lcom/bpjstku/domain/news/model/News;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentbindingInflater1(Context p0, ArrayList<News> p1, News p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, DetailNewsActivity.class, new Pair[]{TuplesKt.to("news_list", p1), TuplesKt.to("selected_news", p2)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = notify + 93;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        DetailNewsActivity$bindingInflater$1 detailNewsActivity$bindingInflater$1 = DetailNewsActivity$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
        if (i3 == 0) {
            return detailNewsActivity$bindingInflater$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        Intent intent = getIntent();
        News news = null;
        ArrayList parcelableArrayListExtra = intent != null ? intent.getParcelableArrayListExtra("news_list") : null;
        if (parcelableArrayListExtra != null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.addAll(parcelableArrayListExtra);
            int i2 = notify + 63;
            cancel = i2 % 128;
            int i3 = i2 % 2;
        }
        Intent intent2 = getIntent();
        if (intent2 != null) {
            int i4 = cancel + 91;
            notify = i4 % 128;
            int i5 = i4 % 2;
            Parcelable parcelableExtra = intent2.getParcelableExtra("selected_news");
            if (i5 == 0) {
                news = (News) parcelableExtra;
                int i6 = 31 / 0;
            } else {
                news = (News) parcelableExtra;
            }
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = news;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        DetailNewsActivity detailNewsActivity = this;
        Intrinsics.checkNotNullParameter(detailNewsActivity, "");
        detailNewsActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1(((ActivityDetailNewsBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityDetailNewsBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.menu_news));
        RecyclerView recyclerView = ((ActivityDetailNewsBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvOtherNews;
        recyclerView.setLayoutManager(new GridLayoutManager(this, this.b));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.addItemDecoration(new getConcurrentCameraSelectors(this.b));
        recyclerView.setAdapter((TrustedWebUtils) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue());
        MaterialButton materialButton = ((ActivityDetailNewsBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).btnShareNews;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new isAssociatedWith()));
        int i2 = notify + 79;
        cancel = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_view_detail_news", "view_detail_news"));
        Intrinsics.checkNotNullParameter(this, "");
        Intrinsics.checkNotNullParameter("view_detail_news", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("view_detail_news", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("view_detail_news", mapMutableMapOf);
        ActivityDetailNewsBinding activityDetailNewsBinding = (ActivityDetailNewsBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        News news = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (news != null) {
            ImageView imageView = activityDetailNewsBinding.imgNews;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            lambdacreateCameraSelectorById0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(imageView, this, news.TuitionPaymentFragmentbindingInflater1, R.drawable.ic_placeholder_wide, R.drawable.ic_placeholder_wide);
            activityDetailNewsBinding.tvNewsTitle.setText(news.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            activityDetailNewsBinding.tvNewsDate.setText(setSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(news.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "dd-MM-yyyy hh:mm:ss", "dd MMM yyyy hh:mm:ss"));
            activityDetailNewsBinding.tvNewsContent.setHtml(news.TuitionPaymentFragmentspecialinlinedviewModeldefault3, new getMatrix(activityDetailNewsBinding.tvNewsContent));
            int i2 = notify + 65;
            cancel = i2 % 128;
            int i3 = i2 % 2;
        }
        TypeIntrinsics.asMutableCollection(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2).remove(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        ((TrustedWebUtils) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = cancel + 103;
        notify = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                p0.getItemId();
                throw null;
            }
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.getItemId() == 16908332) {
                int i3 = cancel + 19;
                notify = i3 % 128;
                int i4 = i3 % 2;
                getOnBackPressedDispatcher().onBackPressed();
                int i5 = cancel + 103;
                notify = i5 % 128;
                int i6 = i5 % 2;
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                int i3 = $11 + 59;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            char c2 = 1;
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i5 = 58224;
            int i6 = 0;
            while (i6 < 16) {
                int i7 = $10 + 85;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c3 = cArr3[c2];
                char c4 = cArr3[c];
                int i9 = i6;
                int i10 = (c4 + i5) ^ ((c4 << 4) + ((char) (((long) f571a) ^ 8611973335120459638L)));
                int i11 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(d);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[c2] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 47774);
                        int iIndexOf = TextUtils.indexOf("", "", 0) + 468;
                        int iAlpha = 13 - Color.alpha(0);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c2] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iIndexOf, iAlpha, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c2] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) g) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(asInterface)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - View.MeasureSpec.getMode(0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 468, ((byte) KeyEvent.getModifierMetaStateMask()) + 14, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6 = i9 + 1;
                    int i12 = $11 + 43;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    c2 = 1;
                    c = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                int size = 2323 - View.MeasureSpec.getSize(0);
                int i14 = 44 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte b = (byte) ($$f - 3);
                byte b2 = b;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cCombineMeasuredStates, size, i14, -1312321721, false, $$i(b, b2, b2), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (29944 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
            int iResolveSize = 1755 - View.resolveSize(0, 0);
            int mirror = AndroidCharacter.getMirror('0') - 25;
            byte[] bArr = $$a;
            byte b = bArr[5];
            short s = bArr[28];
            Object[] objArr2 = new Object[1];
            c(b, s, (byte) (s & 15), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iResolveSize, mirror, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cRed = (char) (Color.red(0) + 29944);
                int i3 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 23;
                byte[] bArr2 = $$a;
                Object[] objArr3 = new Object[1];
                c(bArr2[5], bArr2[0], bArr2[7], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRed, i3, iCombineMeasuredStates, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i4 = ((int[]) objArr4[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{i4}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int i5 = ~(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp | 210853973);
            int i6 = ((((210488753 | i5) * (-658)) + 820165099) + ((i5 | 691616) * 658)) - 211076948;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            e(new char[]{2797, 17279, 28019, 17294, 65454, 62781, 60928, 60918, 30481, 20607, 55506, 39725, 30187, 63578, 46915, 9375, 65142, 5201}, (Process.myTid() >> 22) + 16, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(new char[]{16882, 6365, 17019, 26932, 46549, 22341, 7994, 25448, 33718, 21463, 9400, 5852, 1906, 63699, 11065, 40872, 25961, 47188}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {-1368213138};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (42049 - TextUtils.indexOf("", "")), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1726, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 28, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = DecorContentParent.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -211076948);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 29944);
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1755;
                    int iIndexOf = 23 - TextUtils.indexOf("", "");
                    byte[] bArr3 = $$a;
                    Object[] objArr8 = new Object[1];
                    c(bArr3[5], bArr3[0], bArr3[7], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionGroup, maxKeyCode, iIndexOf, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    e(new char[]{6559, 8507, 34291, 24762, 18114, 64604, 57550, 15323, 46175, 29299, 45376, 34680, 64765, 41174, 9721, 31875, 11910, 8892, 50095, 47520, 31042, 65311, 4571, 32532}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.chademo_ev_connector_type).substring(0, 6).codePointAt(5) - 55, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    e(new char[]{30995, 36612, 45852, 27217, 26115, 35832, 57323, 52778, 57040, 20467, 40542, 32463, 49827, 56117, 63425, 50836, 54239, 4918}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 101, objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 29944);
                        int keyRepeatTimeout = 1755 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int i9 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 22;
                        byte[] bArr4 = $$a;
                        Object[] objArr11 = new Object[1];
                        c(bArr4[5], (short) 88, bArr4[7], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveOpacity, keyRepeatTimeout, i9, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 29944);
                        int i10 = 1756 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 24;
                        byte[] bArr5 = $$a;
                        byte b2 = bArr5[5];
                        short s2 = bArr5[28];
                        Object[] objArr12 = new Object[1];
                        c(b2, s2, (byte) (s2 & 15), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(pressedStateDuration, i10, iLastIndexOf, 986134021, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0];
        int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0];
        if (i12 != i11) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
            if (strArr != null) {
                int i13 = cancel + 47;
                notify = i13 % 128;
                int i14 = i13 % 2;
                while (i2 < strArr.length) {
                    int i15 = notify + 97;
                    cancel = i15 % 128;
                    int i16 = i15 % 2;
                    arrayList.add(strArr[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i12));
        }
        int i17 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
        int i18 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0];
        Object[] objArr13 = {new int[]{i18}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.instruction_prima4_bni).substring(14, 15).length() + 686565501;
        int i19 = (~(641349263 | length)) | 281296960;
        int i20 = ~((~length) | (-68694535));
        int i21 = i17 + (-721812551) + ((i19 | i20) * (-470)) + (((~(length | 922646223)) | i20) * 470);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr13[3])[0] = i23 ^ (i23 << 5);
        int i24 = cancel + 55;
        notify = i24 % 128;
        int i25 = i24 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char keyRepeatTimeout2 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int iRed = 1031 - Color.red(0);
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15;
            byte[] bArr6 = $$a;
            Object[] objArr14 = new Object[1];
            c(bArr6[5], (short) ($$b & 927), bArr6[7], objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(keyRepeatTimeout2, iRed, minimumFlingVelocity, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        e(new char[]{6559, 8507, 34291, 24762, 18114, 64604, 57550, 15323, 46175, 29299, 45376, 34680, 64765, 41174, 9721, 31875, 11910, 8892, 50095, 47520, 31042, 65311, 4571, 32532}, TextUtils.getTrimmedLength("") + 22, objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        e(new char[]{30995, 36612, 45852, 27217, 26115, 35832, 57323, 52778, 57040, 20467, 40542, 32463, 49827, 56117, 63425, 50836, 54239, 4918}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 4, objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1031;
            int iArgb = Color.argb(0, 0, 0, 0) + 15;
            byte[] bArr7 = $$a;
            Object[] objArr17 = new Object[1];
            c(bArr7[5], bArr7[0], bArr7[7], objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(scrollBarSize, scrollBarFadeDuration, iArgb, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char scrollBarFadeDuration2 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int mirror2 = AndroidCharacter.getMirror('0') + 983;
                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15;
                byte b3 = $$a[7];
                Object[] objArr18 = new Object[1];
                c(b3, (short) (b3 | 192), (byte) 52, objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(scrollBarFadeDuration2, mirror2, maximumFlingVelocity, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i26 = ((int[]) objArr19[3])[0];
            int i27 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int length2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlStatusCardWarningTitle).substring(0, 20).length() - 351874901;
            int i28 = (((-1236251483) + (((~(length2 | 185724566)) | 58555603) * 191)) + (((~((~length2) | 185724566)) | 7082049) * 191)) - 874010299;
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr[2])[0] = i30 ^ (i30 << 5);
            int i31 = cancel + 73;
            notify = i31 % 128;
            int i32 = i31 % 2;
        } else {
            Object[] objArr20 = new Object[1];
            e(new char[]{2797, 17279, 28019, 17294, 65454, 62781, 60928, 60918, 30481, 20607, 55506, 39725, 30187, 63578, 46915, 9375, 65142, 5201}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 83, objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            e(new char[]{16882, 6365, 17019, 26932, 46549, 22341, 7994, 25448, 33718, 21463, 9400, 5852, 1906, 63699, 11065, 40872, 25961, 47188}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 15, objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {-1368213138};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (Process.getGidForName("") + 46039), 1134 - (ViewConfiguration.getTouchSlop() >> 8), 18 - (KeyEvent.getMaxKeyCode() >> 16), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, -874010299, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cArgb = (char) Color.argb(0, 0, 0, 0);
                int iAlpha = 1031 - Color.alpha(0);
                int packedPositionType = 15 - ExpandableListView.getPackedPositionType(0L);
                byte[] bArr8 = $$a;
                Object[] objArr24 = new Object[1];
                c(bArr8[5], (short) ($$b & 927), bArr8[7], objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cArgb, iAlpha, packedPositionType, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45994 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 1117 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 17), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char mirror3 = (char) (AndroidCharacter.getMirror('0') - '0');
                int mirror4 = AndroidCharacter.getMirror('0') + 983;
                int iMyTid = (Process.myTid() >> 22) + 15;
                byte b4 = $$a[7];
                Object[] objArr25 = new Object[1];
                c(b4, (short) (b4 | 192), (byte) 52, objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(mirror3, mirror4, iMyTid, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                e(new char[]{6559, 8507, 34291, 24762, 18114, 64604, 57550, 15323, 46175, 29299, 45376, 34680, 64765, 41174, 9721, 31875, 11910, 8892, 50095, 47520, 31042, 65311, 4571, 32532}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14, objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                e(new char[]{30995, 36612, 45852, 27217, 26115, 35832, 57323, 52778, 57040, 20467, 40542, 32463, 49827, 56117, 63425, 50836, 54239, 4918}, TextUtils.getCapsMode("", 0, 0) + 15, objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cArgb2 = (char) Color.argb(0, 0, 0, 0);
                    int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 1031;
                    int iResolveSizeAndState = 15 - View.resolveSizeAndState(0, 0, 0);
                    byte[] bArr9 = $$a;
                    Object[] objArr28 = new Object[1];
                    c(bArr9[5], bArr9[0], bArr9[7], objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cArgb2, maxKeyCode2, iResolveSizeAndState, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                    int scrollDefaultDelay = 1031 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int longPressTimeout = 15 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    byte[] bArr10 = $$a;
                    Object[] objArr29 = new Object[1];
                    c(bArr10[5], (short) ($$b & 927), bArr10[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(capsMode, scrollDefaultDelay, longPressTimeout, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i33 = ((int[]) objArr[1])[0];
        int i34 = ((int[]) objArr[3])[0];
        if (i34 != i33) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i35 = notify + 53;
                cancel = i35 % 128;
                int i36 = i35 % 2;
                while (i2 < strArr3.length) {
                    arrayList2.add(strArr3[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i34));
        }
        Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i37 = ((int[]) objArr[2])[0];
        int i38 = ((int[]) objArr[3])[0];
        int i39 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int i40 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 116929378;
        int i41 = ~i40;
        int i42 = i37 + 709731586 + (((~((-365707858) | i41)) | 121427687) * (-865)) + ((~(i40 | 365707857)) * 865) + (((~(121427687 | i41)) | (~(i41 | 365707857))) * 865);
        int i43 = (i42 << 13) ^ i42;
        int i44 = i43 ^ (i43 >>> 17);
        ((int[]) objArr30[2])[0] = i44 ^ (i44 << 5);
        int i45 = notify + 77;
        cancel = i45 % 128;
        int i46 = i45 % 2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) throws IllegalAccessException {
        DetailNewsActivity detailNewsActivity = (DetailNewsActivity) objArr[0];
        int i = 2 % 2;
        int i2 = notify + 41;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) CameraUseCaseAdapter.b[0]).getInt(null);
        int iNextInt = new Random().nextInt(196018348);
        int i5 = ~iNextInt;
        if (i4 != (((((~(1380197076 | i5)) | (~((-550209534) | iNextInt))) | (~(i5 | 550209533))) * 959) - 471886768) + (((~(iNextInt | 550209533)) | (~(i5 | (-550209534))) | (~(1380197076 | iNextInt))) * 959)) {
            int i6 = 140402944 % 2;
            throw new ArithmeticException();
        }
        int i7 = ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(null);
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i8 = ~iMaxMemory;
        int i9 = 1968919580 + (((~((-2109332396) | i8)) | 355533064) * (-1188));
        int i10 = (~(iMaxMemory | 2109332395)) | 355533064;
        int i11 = ~(393421064 | i8);
        if (i7 != i9 + ((i10 | i11) * 594) + (((~(2109332395 | i8)) | (-2147220396) | i11) * 594)) {
            throw null;
        }
        super.onResume();
        int i12 = cancel + 95;
        notify = i12 % 128;
        if (i12 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1070855110
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.news.DetailNewsActivity.onStart():void");
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -799351327
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.news.DetailNewsActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ TrustedWebUtils TuitionPaymentFragmentbindingInflater1(final DetailNewsActivity detailNewsActivity) {
        int i = 2 % 2;
        TrustedWebUtils trustedWebUtils = new TrustedWebUtils(detailNewsActivity, null, new Function1() { // from class: ExperimentalMinimizationCallback
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DetailNewsActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (News) obj);
            }
        }, 2, null);
        int i2 = notify + 103;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        return trustedWebUtils;
    }

    public static /* synthetic */ Unit b(DetailNewsActivity detailNewsActivity, News news) {
        int i = 2 % 2;
        int i2 = cancel + 81;
        notify = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(news, "");
        Companion.TuitionPaymentFragmentbindingInflater1(detailNewsActivity, detailNewsActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2, news);
        Unit unit = Unit.INSTANCE;
        int i4 = notify + 65;
        cancel = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(View view) {
        int i = 2 % 2;
        int i2 = notify + 95;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (i3 != 0) {
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i4 = notify + 35;
        cancel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return unit2;
    }

    static {
        INotificationSideChannel = 1;
        g();
        INSTANCE = new Companion(null);
        int i = onTransact + 79;
        INotificationSideChannel = i % 128;
        int i2 = i % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityDetailNewsBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = (-1884942747) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion;
        int iB = setAspectRatio.AnonymousClass6.b();
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 536710627;
        return (Function1) TuitionPaymentFragmentspecialinlinedviewModeldefault3(444101192, getAudioCodecMimeType.AnonymousClass3.b(), iCodePointAt, -444101191, new Object[]{this}, i, iB);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_method_description_danamon_online).substring(1, 3).length() - 658640760;
        int iB = getAudioCodecMimeType.AnonymousClass3.b();
        return ((Integer) TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1044746835, setAspectRatio.AnonymousClass6.b(), setAspectRatio.AnonymousClass6.b(), 1044746835, new Object[]{this}, length, iB)).intValue();
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = notify + 87;
        cancel = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = notify + 31;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 52 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = notify + 5;
        cancel = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        int iB = getAudioCodecMimeType.AnonymousClass3.b();
        int iB2 = getAudioCodecMimeType.AnonymousClass3.b();
        int iB3 = setAspectRatio.AnonymousClass6.b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(1668477776, 482024472 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.tab_bca_prima).substring(0, 9).codePointAt(7), iB3, -1668477774, new Object[]{this}, iB, iB2);
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = notify + 33;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = notify + 41;
        cancel = i4 % 128;
        int i5 = i4 % 2;
    }

    static void g() {
        g = (char) 38066;
        asInterface = (char) 48549;
        f571a = (char) 10821;
        d = (char) 29821;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r6, byte r7, byte r8) {
        /*
            int r7 = r7 * 2
            int r7 = 3 - r7
            byte[] r0 = com.bpjstku.presentation.news.DetailNewsActivity.$$c
            int r6 = r6 * 4
            int r6 = 108 - r6
            int r8 = r8 * 3
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
            int r7 = r7 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.news.DetailNewsActivity.$$i(short, byte, byte):java.lang.String");
    }
}
