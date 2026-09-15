package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.registration.pmi.model.request.CityRequest;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.registration.general.model.Registration;
import com.bpjstku.domain.registration.general.model.Verification;
import com.bpjstku.domain.registration.pmi.model.PmiBranchOffice;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class onSuggestionClick extends ViewModel {
    public final MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> TuitionPaymentFragmentbindingInflater1;
    public final MutableLiveData<VirtualCameraAdapter1<BaseModel>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final MutableLiveData<VirtualCameraAdapter1<List<PmiBranchOffice>>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final MutableLiveData<VirtualCameraAdapter1<BaseModel>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> f1311a;
    public final acquireBuffer asBinder;
    public final MutableLiveData<VirtualCameraAdapter1<Registration>> asInterface;
    public final MutableLiveData<VirtualCameraAdapter1<BaseModel>> b;
    public final setContentdefault cancel;
    public final MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> d;
    public final MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> g;
    private final MutableLiveData<VirtualCameraAdapter1<Verification>> notify;
    private final MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> onTransact;

    public onSuggestionClick(setContentdefault setcontentdefault, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(setcontentdefault, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.cancel = setcontentdefault;
        this.asBinder = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = new MutableLiveData<>();
        this.notify = mutableLiveData;
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData2 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mutableLiveData2;
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData3 = new MutableLiveData<>();
        this.b = mutableLiveData3;
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData4 = new MutableLiveData<>();
        this.onTransact = mutableLiveData4;
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData5 = new MutableLiveData<>();
        this.f1311a = mutableLiveData5;
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData6 = new MutableLiveData<>();
        this.TuitionPaymentFragmentbindingInflater1 = mutableLiveData6;
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData7 = new MutableLiveData<>();
        this.g = mutableLiveData7;
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData8 = new MutableLiveData<>();
        this.d = mutableLiveData8;
        MutableLiveData<VirtualCameraAdapter1<List<PmiBranchOffice>>> mutableLiveData9 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mutableLiveData9;
        MutableLiveData<VirtualCameraAdapter1<Registration>> mutableLiveData10 = new MutableLiveData<>();
        this.asInterface = mutableLiveData10;
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData11 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mutableLiveData11;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData3.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion3 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData4.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion4 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData5.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion5 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData6.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion6 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData7.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion7 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData8.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion8 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData9.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion9 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion10 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData10.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion11 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData11.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public final void b() {
        MutableLiveData<VirtualCameraAdapter1<List<PmiBranchOffice>>> mutableLiveData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new BaseRequest())));
        final Function1 function1 = new Function1() { // from class: SearchViewUpdatableTouchDelegate
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onSuggestionClick.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: updateIntent
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: onShareTargetSelected
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onSuggestionClick.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: SuggestionsAdapter
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentbindingInflater1() {
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData = this.d;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new BaseRequest())));
        final Function1 function1 = new Function1() { // from class: setSearchView
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onSuggestionClick.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: ShareActionProvider
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: setBounds
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onSuggestionClick.asBinder(this.TuitionPaymentFragmentbindingInflater1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: showSoftInputIfNecessary
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData = this.f1311a;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new BaseRequest())));
        final Function1 function1 = new Function1() { // from class: onQueryTextChange
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onSuggestionClick.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: SearchViewOnSuggestionListener
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: performCompletion
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onSuggestionClick.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: SearchViewSearchAutoComplete1
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData = this.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new CityRequest(str))));
        final Function1 function1 = new Function1() { // from class: ShareActionProviderOnShareTargetSelectedListener
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onSuggestionClick.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: ShareActionProviderShareMenuItemOnMenuItemClickListener
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: onQueryTextSubmit
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onSuggestionClick.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: SearchViewSavedState1
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData = this.g;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.cancel.b(new BaseRequest())));
        final Function1 function1 = new Function1() { // from class: setShareHistoryFileName
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onSuggestionClick.TuitionPaymentFragmentbindingInflater1(this.b, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: setActivityChooserPolicyIfNeeded
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: setOnShareTargetSelectedListener
            private static final byte[] $$c = {91, -17, 90, 37};
            private static final int $$f = 76;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {21, 65, -9, -121, 41, 28, -3, -3, 30, 7, 29, -72, 72, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
            private static final int $$e = 249;
            private static final byte[] $$a = {91, -9, 99, 11, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
            private static final int $$b = 222;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            private static int TuitionPaymentFragmentbindingInflater1 = 1;
            private static long b = -7864248509769683260L;

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(short r5, short r6, short r7, java.lang.Object[] r8) {
                /*
                    int r6 = r6 * 52
                    int r6 = r6 + 4
                    int r5 = r5 * 15
                    int r0 = 53 - r5
                    byte[] r1 = defpackage.setOnShareTargetSelectedListener.$$a
                    int r7 = r7 * 4
                    int r7 = r7 + 84
                    byte[] r0 = new byte[r0]
                    int r5 = 52 - r5
                    r2 = 0
                    if (r1 != 0) goto L18
                    r4 = r5
                    r3 = r2
                    goto L2a
                L18:
                    r3 = r2
                L19:
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    if (r3 != r5) goto L26
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r0, r2)
                    r8[r2] = r5
                    return
                L26:
                    int r3 = r3 + 1
                    r4 = r1[r6]
                L2a:
                    int r6 = r6 + 1
                    int r4 = -r4
                    int r7 = r7 + r4
                    int r7 = r7 + (-11)
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.setOnShareTargetSelectedListener.a(short, short, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(short r6, int r7, int r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 * 17
                    int r7 = 84 - r7
                    byte[] r0 = defpackage.setOnShareTargetSelectedListener.$$d
                    int r8 = r8 * 43
                    int r8 = 53 - r8
                    int r6 = r6 * 9
                    int r6 = r6 + 4
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L16
                    r3 = r6
                    r4 = r2
                    goto L28
                L16:
                    r3 = r2
                L17:
                    int r4 = r3 + 1
                    byte r5 = (byte) r7
                    r1[r3] = r5
                    if (r4 != r8) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L26:
                    r3 = r0[r6]
                L28:
                    int r6 = r6 + 1
                    int r7 = r7 + r3
                    int r7 = r7 + (-11)
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.setOnShareTargetSelectedListener.d(short, int, int, java.lang.Object[]):void");
            }

            private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                abortCapture abortcapture = new abortCapture();
                char[] cArrB = abortCapture.b(b ^ (-2687588926731523482L), cArr, i);
                abortcapture.b = 4;
                while (abortcapture.b < cArrB.length) {
                    int i3 = $11 + 11;
                    $10 = i3 % 128;
                    int i4 = i3 % 2;
                    abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                    int i5 = abortcapture.b;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(b)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 64838), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1356, 38 - View.MeasureSpec.getMode(0), 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        try {
                            Object[] objArr3 = {abortcapture, abortcapture};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 47773), 468 - Gravity.getAbsoluteGravity(0, 0), 13 - Color.blue(0), 896083767, false, "n", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
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
                }
                objArr[0] = new String(cArrB, 4, cArrB.length - 4);
                int i6 = $10 + 83;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Code duplicated, block: B:22:0x01e8  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cBlue = (char) Color.blue(0);
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 2267;
                    int trimmedLength = 33 - TextUtils.getTrimmedLength("");
                    byte b2 = $$a[7];
                    byte b3 = b2;
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, b3, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, maxKeyCode, trimmedLength, -887667012, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{39400, 39305, 7856, 49391, 37269, 39548, 51663, 7169, 35599, 35315, 56135, 12757, 48279, 46961, 61077, 9008, 44553, 41721, 32839, 21646, 54181, 53297, 37863, 18940, 50467, 65425}, (-1) - TextUtils.indexOf((CharSequence) "", '0'), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{30147, 30118, 37213, 18119, 7196, 5523, 20450, 37258, 26424, 1554, 23919, 48160, 20662, 14478, 26879, 44702, 16946, 11530, 1662}, KeyEvent.normalizeMetaState(0), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    int i2 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2267;
                    int threadPriority = 33 - ((Process.getThreadPriority(0) + 20) >> 6);
                    byte[] bArr = $$a;
                    byte b4 = bArr[7];
                    Object[] objArr5 = new Object[1];
                    a(b4, bArr[5], b4, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, i2, threadPriority, -874156483, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i3 = TuitionPaymentFragmentbindingInflater1 + 31;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                    int i4 = i3 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 2267;
                        int iCombineMeasuredStates = 33 - View.combineMeasuredStates(0, 0);
                        byte[] bArr2 = $$a;
                        Object[] objArr6 = new Object[1];
                        a(bArr2[5], bArr2[40], bArr2[7], objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, offsetAfter, iCombineMeasuredStates, -654680577, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                    int i5 = ((int[]) objArr7[0])[0];
                    int i6 = ((int[]) objArr7[3])[0];
                    String[] strArr = (String[]) objArr7[1];
                    int i7 = ~System.identityHashCode(this);
                    int i8 = (((-107131063) + (((-136337412) | i7) * 494)) + (((~(i7 | (-150232480))) | 836503452) * 494)) - 1927256939;
                    int i9 = (i8 << 13) ^ i8;
                    int i10 = i9 ^ (i9 >>> 17);
                    ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new char[]{65194, 65227, 64865, 53398, 56536, 31149, 55734, 20812, 60493, 27170, 52030, 31896, 56283, 21667, 65202, 28160, 51571, 16696, 36926, 6607, 46332, 13258, 33670, 1191, 41558, 7235, 46344, 13875, 37371, 3799}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new char[]{63111, 63204, 6963, 13599, 4102, 40932, 15401, 40338, 58474, 35959, 11943, 45097, 54247, 45809, 6951, 41625, 49532, 42856, 30135, 54545, 48328, 54687}, (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        if (applicationContext instanceof ContextWrapper) {
                            int i11 = TuitionPaymentFragmentbindingInflater1 + 79;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                            int i12 = i11 % 2;
                            if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                applicationContext = applicationContext.getApplicationContext();
                            } else {
                                applicationContext = null;
                            }
                        } else {
                            applicationContext = applicationContext.getApplicationContext();
                        }
                    }
                    Object[] objArr10 = new Object[1];
                    c(new char[]{2286, 2180, 43282, 59761, 42766, 11729, 57411, 10889, 6728, 15956, 62172, 1806, 11673, 142, 51062, 5505, 16133, 5468, 43464, 25117}, Color.blue(0), objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(new char[]{6052, 6093, 40779, 32615, 26531, 7053, 30278, 59947, 1368, 2056, 25823, 51124, 13052, 13976, 20800, 54589, 8319, 8990, 16351, 41656}, ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr11);
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -1927256939};
                        byte[] bArr3 = $$d;
                        byte b5 = bArr3[16];
                        byte b6 = (byte) (-bArr3[14]);
                        Object[] objArr13 = new Object[1];
                        d(b5, b6, b6, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b7 = (byte) (-bArr3[14]);
                        byte b8 = bArr3[16];
                        Object[] objArr14 = new Object[1];
                        d(b7, b8, b8, objArr14);
                        objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        if (applicationContext != null) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                                int iIndexOf = 2267 - TextUtils.indexOf("", "", 0, 0);
                                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 33;
                                byte[] bArr4 = $$a;
                                Object[] objArr15 = new Object[1];
                                a(bArr4[5], bArr4[40], bArr4[7], objArr15);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(bitsPerPixel, iIndexOf, jumpTapTimeout, -654680577, false, (String) objArr15[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                            try {
                                Object[] objArr16 = new Object[1];
                                c(new char[]{39400, 39305, 7856, 49391, 37269, 39548, 51663, 7169, 35599, 35315, 56135, 12757, 48279, 46961, 61077, 9008, 44553, 41721, 32839, 21646, 54181, 53297, 37863, 18940, 50467, 65425}, View.MeasureSpec.getSize(0), objArr16);
                                Class<?> cls5 = Class.forName((String) objArr16[0]);
                                Object[] objArr17 = new Object[1];
                                c(new char[]{30147, 30118, 37213, 18119, 7196, 5523, 20450, 37258, 26424, 1554, 23919, 48160, 20662, 14478, 26879, 44702, 16946, 11530, 1662}, ViewConfiguration.getPressedStateDuration() >> 16, objArr17);
                                long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                    int i13 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2266;
                                    int i14 = 34 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                    byte[] bArr5 = $$a;
                                    byte b9 = bArr5[7];
                                    Object[] objArr18 = new Object[1];
                                    a(b9, bArr5[5], b9, objArr18);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, i13, i14, -874156483, false, (String) objArr18[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                                    int iCombineMeasuredStates2 = 2267 - View.combineMeasuredStates(0, 0);
                                    int iLastIndexOf = 32 - TextUtils.lastIndexOf("", '0', 0, 0);
                                    byte b10 = $$a[7];
                                    byte b11 = b10;
                                    Object[] objArr19 = new Object[1];
                                    a(b10, b11, b11, objArr19);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSizeAndState, iCombineMeasuredStates2, iLastIndexOf, -887667012, false, (String) objArr19[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            } catch (Exception unused) {
                                throw new RuntimeException();
                            }
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                int i15 = ((int[]) objArr[3])[0];
                int i16 = ((int[]) objArr[0])[0];
                if (i16 == i15) {
                    Object[] objArr20 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                    int i17 = ((int[]) objArr[2])[0];
                    int i18 = ((int[]) objArr[0])[0];
                    int i19 = ((int[]) objArr[3])[0];
                    String[] strArr2 = (String[]) objArr[1];
                    int i20 = ~((int) SystemClock.elapsedRealtime());
                    int i21 = i17 + ((((-1965648581) + (((~(i20 | (-573686660))) | (~((-201465881) | i20))) * (-184))) + (((16780388 | (~((-218246269) | i20))) | (~((-590467048) | i20))) * 184)) - 313229496);
                    int i22 = (i21 << 13) ^ i21;
                    int i23 = i22 ^ (i22 >>> 17);
                    ((int[]) objArr20[2])[0] = i23 ^ (i23 << 5);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr3 = (String[]) objArr[1];
                    if (strArr3 != null) {
                        int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
                        int i25 = i24 % 128;
                        TuitionPaymentFragmentbindingInflater1 = i25;
                        int i26 = i24 % 2;
                        int i27 = i25 + 77;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i27 % 128;
                        int i28 = i27 % 2;
                        for (String str : strArr3) {
                            arrayList.add(str);
                        }
                    }
                    Toast.makeText((Context) null, i16 / (((i16 - 1) * i16) % 2), 0).show();
                    Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                    int i29 = ((int[]) objArr[2])[0];
                    int i30 = ((int[]) objArr[0])[0];
                    int i31 = ((int[]) objArr[3])[0];
                    String[] strArr4 = (String[]) objArr[1];
                    int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                    int i32 = i29 + 2024888555 + (((~(iMaxMemory | (-98411283))) | 907124598) * 191) + (((~((~iMaxMemory) | (-98411283))) | 68256530) * 191);
                    int i33 = (i32 << 13) ^ i32;
                    int i34 = i33 ^ (i33 >>> 17);
                    ((int[]) objArr21[2])[0] = i34 ^ (i34 << 5);
                }
                return onSuggestionClick.d(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Throwable) obj);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(int r6, byte r7, byte r8) {
                /*
                    int r7 = r7 * 2
                    int r7 = r7 + 107
                    int r8 = r8 * 4
                    int r8 = 4 - r8
                    int r6 = r6 * 2
                    int r6 = 1 - r6
                    byte[] r0 = defpackage.setOnShareTargetSelectedListener.$$c
                    byte[] r1 = new byte[r6]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r7 = r6
                    r3 = r8
                    r4 = r2
                    goto L27
                L17:
                    r3 = r2
                L18:
                    int r4 = r3 + 1
                    byte r5 = (byte) r7
                    r1[r3] = r5
                    if (r4 != r6) goto L25
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L25:
                    r3 = r0[r8]
                L27:
                    int r8 = r8 + 1
                    int r7 = r7 + r3
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.setOnShareTargetSelectedListener.$$g(int, byte, byte):java.lang.String");
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: setShareIntent
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.asBinder.isDisposed()) {
            return;
        }
        this.asBinder.dispose();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(onSuggestionClick onsuggestionclick, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, onsuggestionclick.TuitionPaymentFragmentbindingInflater1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(onSuggestionClick onsuggestionclick, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, onsuggestionclick.f1311a);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(onSuggestionClick onsuggestionclick, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData = onsuggestionclick.g;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(onSuggestionClick onsuggestionclick, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<PmiBranchOffice>>> mutableLiveData = onsuggestionclick.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(onSuggestionClick onsuggestionclick, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, onsuggestionclick.asInterface);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(onSuggestionClick onsuggestionclick, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, onsuggestionclick.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(onSuggestionClick onsuggestionclick, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, onsuggestionclick.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(onSuggestionClick onsuggestionclick, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData = onsuggestionclick.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(onSuggestionClick onsuggestionclick, BaseModel baseModel) {
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = onsuggestionclick.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseModel));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(onSuggestionClick onsuggestionclick, Registration registration) {
        MutableLiveData<VirtualCameraAdapter1<Registration>> mutableLiveData = onsuggestionclick.asInterface;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(registration));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(onSuggestionClick onsuggestionclick, BaseModel baseModel) {
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = onsuggestionclick.b;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseModel));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(onSuggestionClick onsuggestionclick, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData = onsuggestionclick.d;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit a(onSuggestionClick onsuggestionclick, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, onsuggestionclick.b);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asBinder(onSuggestionClick onsuggestionclick, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, onsuggestionclick.d);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(onSuggestionClick onsuggestionclick, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData = onsuggestionclick.f1311a;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit d(onSuggestionClick onsuggestionclick, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, onsuggestionclick.g);
        return Unit.INSTANCE;
    }
}
