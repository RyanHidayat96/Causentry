package com.bpjstku.presentation.loyalti;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.appsflyer.internal.AFg1xSDK;
import com.bpjstku.R;
import com.bpjstku.databinding.ActivityListFeatureLoyaltiBinding;
import com.bpjstku.presentation.loyalti.ListFeatureLoyaltiActivity;
import com.bpjstku.presentation.loyalti.model.LoyaltiMenu;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.libraries.places.api.model.zzn;
import defpackage.MenuBuilderItemInvoker;
import defpackage.SessionProcessor;
import defpackage.ViewPortBuilder;
import defpackage.calculateCameraUseCases;
import defpackage.createExtraPreview;
import defpackage.getTextOn;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00020\u00108UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00158UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0007\u001a\u00020\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019"}, d2 = {"Lcom/bpjstku/presentation/loyalti/ListFeatureLoyaltiActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityListFeatureLoyaltiBinding;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "a", "asInterface", "asBinder", "Landroid/view/MenuItem;", "p0", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "TuitionPaymentFragmentbindingInflater1", "()Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()I", "LMenuBuilderItemInvoker;", "Lkotlin/Lazy;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ListFeatureLoyaltiActivity extends BindingBaseActivity<ActivityListFeatureLoyaltiBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int d;
    private final Lazy b = LazyKt.lazy(new Function0() { // from class: setShortcutsVisible
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ListFeatureLoyaltiActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
        }
    });
    private static final byte[] $$c = {81, -102, -70, -91};
    private static final int $$f = 102;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {118, 35, -100, -35, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 0;
    private static int asBinder = 0;
    private static int g = 0;
    private static int asInterface = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = 144 - r7
            int r8 = 53 - r8
            byte[] r0 = com.bpjstku.presentation.loyalti.ListFeatureLoyaltiActivity.$$a
            int r9 = r9 * 14
            int r9 = 98 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r5 = r2
            r9 = r7
            goto L2b
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.loyalti.ListFeatureLoyaltiActivity.c(short, int, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.loyalti.ListFeatureLoyaltiActivity$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/loyalti/ListFeatureLoyaltiActivity$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static int TuitionPaymentFragmentbindingInflater1 = -1893275080;

        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            p0.startActivity(new Intent(p0, (Class<?>) ListFeatureLoyaltiActivity.class));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityListFeatureLoyaltiBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asInterface + 93;
        g = i2 % 128;
        int i3 = i2 % 2;
        ListFeatureLoyaltiActivity$bindingInflater$1 listFeatureLoyaltiActivity$bindingInflater$1 = ListFeatureLoyaltiActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = asInterface + 119;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            return listFeatureLoyaltiActivity$bindingInflater$1;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        ListFeatureLoyaltiActivity listFeatureLoyaltiActivity = this;
        Intrinsics.checkNotNullParameter(listFeatureLoyaltiActivity, "");
        listFeatureLoyaltiActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1(((ActivityListFeatureLoyaltiBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityListFeatureLoyaltiBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.menu_loyalti));
        RecyclerView recyclerView = ((ActivityListFeatureLoyaltiBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvListLoyalti;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter((MenuBuilderItemInvoker) this.b.getValue());
        int i2 = g + 105;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:5:0x0016, B:12:0x0037, B:11:0x0030, B:9:0x0027), top: B:18:0x0011 }] */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = asInterface + 113;
        g = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                int i3 = 77 / 0;
                if (p0.getItemId() == 16908332) {
                    getOnBackPressedDispatcher().onBackPressed();
                }
            } else {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                Intrinsics.checkNotNullParameter(p0, "");
                if (p0.getItemId() == 16908332) {
                    getOnBackPressedDispatcher().onBackPressed();
                }
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i4 = g + 75;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i4 = $10 + 115;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 8329);
                    int fadingEdgeLength = 1235 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 35;
                    byte b = (byte) ($$f & 11);
                    byte b2 = (byte) (b - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, fadingEdgeLength, offsetBefore, -653973969, false, $$i(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), Color.argb(0, 0, 0, 0) + 2764, 14 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1504416861, false, $$i(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((Process.myTid() >> 22) + 43325), 254 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 22 - View.resolveSizeAndState(0, 0, 0), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b5 = (byte) 1;
                                byte b6 = (byte) (b5 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.combineMeasuredStates(0, 0) + 65200), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2891, 17 - (ViewConfiguration.getFadingEdgeLength() >> 16), 2012627446, false, $$i(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = sessionProcessor.b;
                            cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L)))));
                            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                            i2 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
        int i6 = $10 + 93;
        $11 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int mode = View.MeasureSpec.getMode(0) + 1031;
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 15;
            int i3 = $$b;
            Object[] objArr2 = new Object[1];
            c((short) (i3 | 141), (byte) i3, $$a[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(minimumFlingVelocity, mode, windowTouchSlop, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{37668, 7855, 40128, 43836}, new char[]{64606, 6205, 41448, 19269}, (char) (ViewConfiguration.getTouchSlop() >> 8), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{17191, 26249, 48323, 21416, 55355, 11110, 47664, 4747, 53422, 45358, 17005, 57516, 34150, 46853, 47382, 3935, 41148, 19936, 29054, 6779, 21997, 53020}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{37668, 7855, 40128, 43836}, new char[]{56630, 64123, 15784, 20681}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 51481), (-1459979299) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{11065, 43539, 36540, 17121, 5363, 33580, 40122, 18387, 10458, 49051, 63850, 53772, 11902, 19272, 57422}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
            int minimumFlingVelocity2 = 1031 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int gidForName = 14 - Process.getGidForName("");
            int i4 = $$b;
            Object[] objArr5 = new Object[1];
            c((short) (i4 | 89), (byte) i4, $$a[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maxKeyCode, minimumFlingVelocity2, gidForName, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char trimmedLength = (char) TextUtils.getTrimmedLength("");
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1031;
                int scrollBarSize = 15 - (ViewConfiguration.getScrollBarSize() >> 8);
                int i5 = $$b;
                Object[] objArr6 = new Object[1];
                c((short) (i5 | 37), (byte) (i5 | 52), (byte) i5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(trimmedLength, packedPositionGroup, scrollBarSize, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i6 = ((int[]) objArr7[3])[0];
            int i7 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int i8 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
            int i9 = ~i8;
            int i10 = (-858942050) + (((~(i9 | (-758876978))) | 1003157147) * (-1042)) + (((-758876978) | i8) * 521) + (((~(i8 | (-1003157148))) | 314602634 | (~(i9 | (-70322465)))) * 521) + 1533329446;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[2])[0] = i12 ^ (i12 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{37668, 7855, 40128, 43836}, new char[]{33941, 17363, 27063, 8203}, (char) (2921 - Color.green(0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 106, new char[]{22052, 57824, 50617, 26355, 6851, 34630, 9502, 38310, 2737, 4356, 8232, 1532, 20209, 36490, 13294, 61056}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{37668, 7855, 40128, 43836}, new char[]{51346, 30435, 23793, 7572}, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 37980), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{14740, 648, 9960, 8457, 27981, 10167, 50145, 9401, 51689, 63441, 22775, 46284, 31355, 24274, 7598, 49616}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {520531837};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46038 - (ViewConfiguration.getScrollBarSize() >> 8)), 1133 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 1533329446, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cRed = (char) Color.red(0);
                    int packedPositionChild = 1030 - ExpandableListView.getPackedPositionChild(0L);
                    int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 16;
                    int i13 = $$b;
                    Object[] objArr12 = new Object[1];
                    c((short) (i13 | 141), (byte) i13, $$a[5], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRed, packedPositionChild, packedPositionChild2, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 45994), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1116, 17 - View.resolveSize(0, 0)), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1031;
                    int iIndexOf = 14 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int i14 = $$b;
                    Object[] objArr13 = new Object[1];
                    c((short) (i14 | 37), (byte) (i14 | 52), (byte) i14, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cNormalizeMetaState, iCombineMeasuredStates, iIndexOf, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{37668, 7855, 40128, 43836}, new char[]{64606, 6205, 41448, 19269}, (char) ((Process.getThreadPriority(0) + 20) >> 6), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.notification_otp_message).substring(8, 9).codePointAt(0) - 103, new char[]{17191, 26249, 48323, 21416, 55355, 11110, 47664, 4747, 53422, 45358, 17005, 57516, 34150, 46853, 47382, 3935, 41148, 19936, 29054, 6779, 21997, 53020}, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{37668, 7855, 40128, 43836}, new char[]{56630, 64123, 15784, 20681}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_app_instruction_5).substring(25, 26).length() + 51516), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 1459979414, new char[]{11065, 43539, 36540, 17121, 5363, 33580, 40122, 18387, 10458, 49051, 63850, 53772, 11902, 19272, 57422}, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char c = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                        int i15 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1030;
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 15;
                        int i16 = $$b;
                        Object[] objArr16 = new Object[1];
                        c((short) (i16 | 89), (byte) i16, $$a[5], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c, i15, pressedStateDuration, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                        int iRgb = (-16776185) - Color.rgb(0, 0, 0);
                        int offsetBefore = 15 - TextUtils.getOffsetBefore("", 0);
                        int i17 = $$b;
                        Object[] objArr17 = new Object[1];
                        c((short) (i17 | 141), (byte) i17, $$a[5], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(modifierMetaStateMask, iRgb, offsetBefore, 1357589585, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        if (((int[]) objArr[3])[0] == ((int[]) objArr[1])[0]) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i18 = ((int[]) objArr[2])[0];
            int i19 = ((int[]) objArr[3])[0];
            int i20 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int i21 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
            int i22 = ~i21;
            int i23 = i18 + (-31512991) + (((~(98048433 | i22)) | 136790024) * 184) + ((i21 | 88606721) * (-184)) + ((~((-146231737) | i22)) * 184);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr18[2])[0] = i25 ^ (i25 << 5);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cBlue = (char) (29944 - Color.blue(0));
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1756;
                int iIndexOf3 = 23 - TextUtils.indexOf("", "", 0);
                int i26 = $$b;
                Object[] objArr19 = new Object[1];
                c((short) (i26 | 37), (byte) (i26 | 15), $$a[5], objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cBlue, iIndexOf2, iIndexOf3, 986134021, false, (String) objArr19[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char cResolveSize = (char) (29944 - View.resolveSize(0, 0));
                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 1755;
                    int i27 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 22;
                    int i28 = $$b;
                    Object[] objArr20 = new Object[1];
                    c((short) (i28 | 89), (byte) i28, $$a[5], objArr20);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cResolveSize, offsetAfter, i27, 1599039318, false, (String) objArr20[0], null);
                }
                Object[] objArr21 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr21[0])[0]}, new int[]{((int[]) objArr21[1])[0]}, (Object[]) objArr21[2], new int[1], (String[]) objArr21[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i29 = (((1594296156 + (((~((~iIdentityHashCode) | (-254837194))) | (-42234768)) * (-235))) + (((~((-254837194) | iIdentityHashCode)) | (-42234768)) * (-470))) + (((~(iIdentityHashCode | (-33554826))) | (-263517136)) * 235)) - 159054177;
                int i30 = (i29 << 13) ^ i29;
                int i31 = i30 ^ (i30 >>> 17);
                ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i31 ^ (i31 << 5);
            } else {
                Object[] objArr22 = new Object[1];
                e(new char[]{37668, 7855, 40128, 43836}, new char[]{33941, 17363, 27063, 8203}, (char) (AndroidCharacter.getMirror('0') + 2873), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36, new char[]{22052, 57824, 50617, 26355, 6851, 34630, 9502, 38310, 2737, 4356, 8232, 1532, 20209, 36490, 13294, 61056}, objArr22);
                Class<?> cls4 = Class.forName((String) objArr22[0]);
                Object[] objArr23 = new Object[1];
                e(new char[]{37668, 7855, 40128, 43836}, new char[]{51346, 30435, 23793, 7572}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 37944), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 107, new char[]{14740, 648, 9960, 8457, 27981, 10167, 50145, 9401, 51689, 63441, 22775, 46284, 31355, 24274, 7598, 49616}, objArr23);
                int iIntValue2 = ((Integer) cls4.getMethod((String) objArr23[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr24 = {520531837};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42049 - TextUtils.getOffsetBefore("", 0)), 1726 - View.MeasureSpec.makeMeasureSpec(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentbindingInflater1$7879113 = AFg1xSDK.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr24), -159054177, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                    char fadingEdgeLength = (char) (29944 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                    int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 1755;
                    int i32 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 23;
                    int i33 = $$b;
                    Object[] objArr25 = new Object[1];
                    c((short) (i33 | 89), (byte) i33, $$a[5], objArr25);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(fadingEdgeLength, maxKeyCode2, i32, 1599039318, false, (String) objArr25[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                try {
                    Object[] objArr26 = new Object[1];
                    e(new char[]{37668, 7855, 40128, 43836}, new char[]{64606, 6205, 41448, 19269}, (char) Drawable.resolveOpacity(0, 0), Color.blue(0), new char[]{17191, 26249, 48323, 21416, 55355, 11110, 47664, 4747, 53422, 45358, 17005, 57516, 34150, 46853, 47382, 3935, 41148, 19936, 29054, 6779, 21997, 53020}, objArr26);
                    Class<?> cls5 = Class.forName((String) objArr26[0]);
                    Object[] objArr27 = new Object[1];
                    e(new char[]{37668, 7855, 40128, 43836}, new char[]{56630, 64123, 15784, 20681}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.card_registration).substring(12, 13).length() + 51516), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.epay_bri).substring(0, 9).codePointAt(0) - 1459979400, new char[]{11065, 43539, 36540, 17121, 5363, 33580, 40122, 18387, 10458, 49051, 63850, 53772, 11902, 19272, 57422}, objArr27);
                    long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 29945);
                        int iMakeMeasureSpec = 1755 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        int scrollBarSize2 = 23 - (ViewConfiguration.getScrollBarSize() >> 8);
                        short s = (short) $$b;
                        Object[] objArr28 = new Object[1];
                        c(s, (byte) s, $$a[5], objArr28);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cIndexOf, iMakeMeasureSpec, scrollBarSize2, 1596667560, false, (String) objArr28[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                        char c2 = (char) (29945 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int iIndexOf4 = TextUtils.indexOf("", "", 0, 0) + 1755;
                        int iIndexOf5 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24;
                        int i34 = $$b;
                        Object[] objArr29 = new Object[1];
                        c((short) (i34 | 37), (byte) (i34 | 15), $$a[5], objArr29);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c2, iIndexOf4, iIndexOf5, 986134021, false, (String) objArr29[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            }
            int i35 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
            int i36 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
            if (i36 == i35) {
                int i37 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
                Object[] objArr30 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
                int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bank_bni_transfer).substring(0, 8).codePointAt(1) + 539972964;
                int i38 = ~iCodePointAt;
                int i39 = i37 + 823742793 + ((~(1037610063 | i38)) * (-560)) + ((~(iCodePointAt | 1039973983)) * (-560)) + (((~((-825007638) | i38)) | 822643717) * 560);
                int i40 = (i39 << 13) ^ i39;
                int i41 = i40 ^ (i40 >>> 17);
                ((int[]) objArr30[3])[0] = i41 ^ (i41 << 5);
                int i42 = g + 5;
                asInterface = i42 % 128;
                if (i42 % 2 == 0) {
                    throw null;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
            if (strArr3 != null) {
                int i43 = asInterface + 31;
                g = i43 % 128;
                int i44 = i43 % 2 != 0 ? 1 : 0;
                while (i44 < strArr3.length) {
                    int i45 = asInterface + 109;
                    g = i45 % 128;
                    if (i45 % 2 != 0) {
                        arrayList.add(strArr3[i44]);
                        i44 += 37;
                    } else {
                        arrayList.add(strArr3[i44]);
                        i44++;
                    }
                }
            }
            int[] iArr = new int[i36];
            int i46 = i36 - 1;
            iArr[i46] = 1;
            Toast.makeText((Context) null, iArr[((i36 * i46) % 2) - 1], 1).show();
            int i47 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
            Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
            int i48 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
            int i49 = i47 + ((((-251538111) + (((~(i48 | 368443086)) | (~((-4320393) | i48))) * (-184))) + (((288362560 | (~((-292682953) | i48))) | (~(80080526 | i48))) * 184)) - 1054962952);
            int i50 = (i49 << 13) ^ i49;
            int i51 = i50 ^ (i50 >>> 17);
            ((int[]) objArr31[3])[0] = i51 ^ (i51 << 5);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String[] strArr4 = (String[]) objArr[0];
        if (strArr4 == null) {
            throw null;
        }
        int i52 = asInterface + 27;
        while (true) {
            g = i52 % 128;
            int i53 = i52 % 2;
            if (i2 >= strArr4.length) {
                throw null;
            }
            arrayList2.add(strArr4[i2]);
            i2++;
            i52 = asInterface + 83;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -496836579
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.loyalti.ListFeatureLoyaltiActivity.onResume():void");
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchMethodException {
        int i = 2 % 2;
        int i2 = asInterface + 43;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[1]).getInt(null);
            int i4 = ~((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            if (i3 != 831658922 + (((~(1279520116 | i4)) | (-449532574)) * (-983)) + (((~(i4 | (-449532574))) | 138625044) * 983)) {
                throw null;
            }
        } else {
            int i5 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
            int iMyTid = Process.myTid();
            int i6 = ~(1350777780 | iMyTid);
            int i7 = ~iMyTid;
            int i8 = i6 | (~(520790237 | i7));
            int i9 = ~((-1350777781) | i7);
            if (i5 != (-191443232) + ((i8 | i9) * (-516)) + (((~(iMyTid | (-252215370))) | (~((-268574869) | i7))) * 516) + ((268574868 | i9) * 516)) {
                throw null;
            }
        }
        int i10 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.confirm_gopay_deeplink).substring(1, 2).codePointAt(0) - 1099102792;
        int i11 = (-584591528) + ((iCodePointAt | 305193992) * (-859));
        int i12 = ~iCodePointAt;
        if (i10 != i11 + (((~(iCodePointAt | (-33579009))) | (~(305193992 | i12))) * 859) + (((~(2021105323 | i12)) | (-2054684332)) * 859)) {
            int[] iArr = new int[545107083];
            iArr[545107082] = 1;
            int i13 = (-1819580690) % 2;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        }
        super.onStart();
        int i14 = asInterface + 93;
        g = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 89 / 0;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) throws IllegalAccessException {
        ListFeatureLoyaltiActivity listFeatureLoyaltiActivity = (ListFeatureLoyaltiActivity) objArr[0];
        Bundle bundle = (Bundle) objArr[1];
        int i = 2 % 2;
        int i2 = g + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i5 = ~startUptimeMillis;
        int i6 = (~((-551485482) | i5)) | 5701632;
        int i7 = ~(startUptimeMillis | 1927256873);
        if (i4 != (-1315074782) + ((i6 | i7) * (-713)) + (i7 * 1426) + ((~(1381473024 | i5)) * 713)) {
            throw new RuntimeException("-1510630279");
        }
        int i8 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        if (i8 != ((((~((-536888355) | iElapsedRealtime)) | 1177616512) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 1689389998) + ((~((~iElapsedRealtime) | (-536888355))) * TypedValues.PositionType.TYPE_TRANSITION_EASING)) {
            throw new RuntimeException("766147006");
        }
        super.onCreate(bundle);
        int i9 = asInterface + 49;
        g = i9 % 128;
        if (i9 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ListFeatureLoyaltiActivity listFeatureLoyaltiActivity, LoyaltiMenu loyaltiMenu) {
        int i = 2 % 2;
        int i2 = asInterface + 21;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(loyaltiMenu, "");
        if (i3 != 0) {
            Intrinsics.areEqual(loyaltiMenu.TuitionPaymentFragmentspecialinlinedviewModeldefault3, "1");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (Intrinsics.areEqual(loyaltiMenu.TuitionPaymentFragmentspecialinlinedviewModeldefault3, "1")) {
            int i4 = g + 85;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            LoyaltiOttRctiplusActivity.Companion companion = LoyaltiOttRctiplusActivity.INSTANCE;
            LoyaltiOttRctiplusActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(listFeatureLoyaltiActivity);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ MenuBuilderItemInvoker TuitionPaymentFragmentspecialinlinedviewModeldefault3(final ListFeatureLoyaltiActivity listFeatureLoyaltiActivity) {
        int i = 2 % 2;
        String string = listFeatureLoyaltiActivity.getString(R.string.title_list_comarketing_mnc);
        Intrinsics.checkNotNullExpressionValue(string, "");
        MenuBuilderItemInvoker menuBuilderItemInvoker = new MenuBuilderItemInvoker(listFeatureLoyaltiActivity, CollectionsKt.mutableListOf(new LoyaltiMenu("1", string, "", R.drawable.ic_mnc)), new Function1() { // from class: startDispatchingItemsChanged
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ListFeatureLoyaltiActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (LoyaltiMenu) obj);
            }
        });
        int i2 = asInterface + 15;
        g = i2 % 128;
        int i3 = i2 % 2;
        return menuBuilderItemInvoker;
    }

    public static /* synthetic */ Object b(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i4;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = ~i6;
        int i11 = i9 | (~(i10 | i));
        int i12 = i8 | i4;
        int i13 = ~(i12 | i6);
        int i14 = (~(i | i7)) | (~(i8 | i10)) | (~i12);
        int i15 = i4 + i6 + i5 + (1650861130 * i3) + ((-924421097) * i2);
        int i16 = i15 * i15;
        int i17 = (i4 * (-405912681)) + 1474035712 + ((-405912681) * i6) + (i11 * (-1619411862)) + (1619411862 * i13) + ((-1619411862) * i14) + ((-2025324544) * i5) + (986710016 * i3) + ((-948436992) * i2) + ((-1864630272) * i16);
        int i18 = ((i4 * (-959335331)) - 587927435) + (i6 * (-959335331)) + (i11 * 462) + (i13 * (-462)) + (i14 * 462) + (i5 * (-959334869)) + (i3 * 22983790) + (i2 * 637852125) + (i16 * (-1124859904));
        if (i17 + (i18 * i18 * (-1807482880)) == 1) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        int i19 = 2 % 2;
        int i20 = asInterface + 51;
        g = i20 % 128;
        int i21 = i20 % 2;
        return null;
    }

    static {
        d = 1;
        g();
        INSTANCE = new Companion(null);
        int i = asBinder + 51;
        d = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = g + 123;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return R.layout.activity_list_feature_loyalti;
        }
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = g + 15;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        int i = 2 % 2;
        int i2 = asInterface + 73;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 13 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int iTuitionPaymentFragmentbindingInflater1 = zzn.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = getTextOn.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = zzn.TuitionPaymentFragmentbindingInflater1();
        b(iTuitionPaymentFragmentbindingInflater1, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) + 2012712820, iTuitionPaymentFragmentbindingInflater3, -137394953, iTuitionPaymentFragmentbindingInflater2, 137394953, new Object[]{this});
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int iTuitionPaymentFragmentbindingInflater1 = getTextOn.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = getTextOn.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater3 = getTextOn.TuitionPaymentFragmentbindingInflater1();
        b(iTuitionPaymentFragmentbindingInflater1, zzn.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater3, 843338364, iTuitionPaymentFragmentbindingInflater2, -843338363, new Object[]{this, bundle});
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        g = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        int i4 = g + 97;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 883393494208091669L;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -981105359;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 34097;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(byte r6, byte r7, int r8) {
        /*
            int r7 = r7 * 2
            int r0 = r7 + 1
            int r8 = r8 * 2
            int r8 = 3 - r8
            int r6 = 104 - r6
            byte[] r1 = com.bpjstku.presentation.loyalti.ListFeatureLoyaltiActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2b:
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.loyalti.ListFeatureLoyaltiActivity.$$i(byte, byte, int):java.lang.String");
    }
}
