package com.bpjstku.presentation.program;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bpjstku.R;
import com.bpjstku.data.syariah.model.response.SyariahFaqResponse;
import com.bpjstku.databinding.ActivityProgramBinding;
import com.bpjstku.presentation.program.ProgramActivity;
import com.bpjstku.presentation.program.jht.olddaysecurity.OldDaySecurityActivity;
import com.bpjstku.presentation.program.jkk.JkkServiceActivity;
import com.bpjstku.presentation.program.jkm.JkmServiceActivity;
import com.bpjstku.presentation.program.jkp.JkpMainActivity;
import com.bpjstku.presentation.program.jpn.JpnMainActivity;
import com.bpjstku.presentation.program.model.ProgramInfo;
import com.bpjstku.util.viewbinding.BindingBaseActivity;
import com.google.android.gms.internal.measurement.zzdm;
import defpackage.CameraCaptureResultImageInfo;
import defpackage.DecorContentParent;
import defpackage.TargetAspectRatio;
import defpackage.ViewPortBuilder;
import defpackage.calculateCameraUseCases;
import defpackage.checkUnsupportedFeatureCombinationAndThrow;
import defpackage.createExtraPreview;
import defpackage.getCaptureResult;
import defpackage.getIncrementalScaleFactor;
import defpackage.getTagBundle;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002#\u000bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000f\u0010\u0004J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00148\u0015X\u0094D¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\b\u0010\u0016R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00020\u00188UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001aR*\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001bj\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\u0018\u0010\n\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001fR\u0015\u0010\u000b\u001a\u00020 8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010!R\u0015\u0010\u000f\u001a\u00020\"8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010!"}, d2 = {"Lcom/bpjstku/presentation/program/ProgramActivity;", "Lcom/bpjstku/util/viewbinding/BindingBaseActivity;", "Lcom/bpjstku/databinding/ActivityProgramBinding;", "<init>", "()V", "Lcom/bpjstku/presentation/program/model/ProgramInfo;", "p0", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/bpjstku/presentation/program/model/ProgramInfo;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "asBinder", "asInterface", "a", "Landroid/view/MenuItem;", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "", "I", "()I", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "()Lkotlin/jvm/functions/Function1;", "Ljava/util/ArrayList;", "Lkotlin/collections/b;", "Ljava/util/ArrayList;", "Lcom/bpjstku/presentation/program/ProgramActivity$ProgramDetailType;", "Lcom/bpjstku/presentation/program/ProgramActivity$ProgramDetailType;", "LgetCaptureResult;", "Lkotlin/Lazy;", "LgetTagBundle;", "ProgramDetailType"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProgramActivity extends BindingBaseActivity<ActivityProgramBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f580a;
    private static char asBinder;
    private static char d;
    private static char g;
    private static int notify;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private ArrayList<ProgramInfo> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentbindingInflater1 = R.layout.activity_program;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: getSurfaceResolution
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ProgramActivity.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy a = LazyKt.lazy(new Function0() { // from class: getUseCaseConfig
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ProgramActivity.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private ProgramDetailType TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {83, -44, 103, 46};
    private static final int $$f = 232;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {49, 84, -120, 101, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 118;
    private static int INotificationSideChannel = 1;
    private static int onTransact = 0;
    private static int cancel = 1;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = ~i;
        int i11 = i9 | (~(i8 | i10));
        int i12 = ~(i | i5 | i2);
        int i13 = i11 | i12;
        int i14 = i10 | i5;
        int i15 = i5 + i2 + i4 + (112060874 * i3) + ((-1891258303) * i6);
        int i16 = i15 * i15;
        int i17 = (i5 * 1286644997) + 1783103488 + (1286644997 * i2) + (i13 * (-1821943044)) + ((-651081208) * i12) + ((-1821943044) * i14) + ((-535298048) * i4) + ((-1427111936) * i3) + (1712848896 * i6) + (159514624 * i16);
        int i18 = ((i5 * (-1669307009)) - 1771304782) + (i2 * (-1669307009)) + (i13 * 564) + (i12 * (-1128)) + (i14 * 564) + (i4 * (-1669306445)) + (i3 * (-1582645698)) + (i6 * (-198941581)) + (i16 * (-203030528));
        int i19 = i17 + (i18 * i18 * (-2008154112));
        if (i19 != 1) {
            return i19 != 2 ? TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        return TuitionPaymentFragmentbindingInflater1(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 14
            int r9 = r9 + 84
            int r8 = r8 + 1
            byte[] r0 = com.bpjstku.presentation.program.ProgramActivity.$$a
            int r7 = r7 + 4
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
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            int r7 = r7 + 1
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
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.ProgramActivity.c(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.bpjstku.presentation.program.ProgramActivity$ProgramDetailType[], still in use, count: 1, list:
  (r0v1 com.bpjstku.presentation.program.ProgramActivity$ProgramDetailType[]) from 0x001c: INVOKE (r0v1 com.bpjstku.presentation.program.ProgramActivity$ProgramDetailType[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m)]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/bpjstku/presentation/program/ProgramActivity$ProgramDetailType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "p0", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProgramDetailType implements Parcelable {
        OPEN_PROGRAM_INFO,
        OPEN_PROGRAM_MENU;

        public static final Parcelable.Creator<ProgramDetailType> CREATOR;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        private ProgramDetailType() {
            super(str, i);
        }

        static {
            EnumEntriesKt.enumEntries(programDetailTypeArr);
            CREATOR = new TuitionPaymentFragmentbindingInflater1();
        }

        public static ProgramDetailType valueOf(String str) {
            return (ProgramDetailType) Enum.valueOf(ProgramDetailType.class, str);
        }

        public static ProgramDetailType[] values() {
            return (ProgramDetailType[]) TuitionPaymentFragmentbindingInflater1.clone();
        }

        public static final class TuitionPaymentFragmentbindingInflater1 implements Parcelable.Creator<ProgramDetailType> {
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ProgramDetailType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return ProgramDetailType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ProgramDetailType[] newArray(int i) {
                return new ProgramDetailType[i];
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel p0, int p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            p0.writeString(name());
        }
    }

    /* JADX INFO: renamed from: com.bpjstku.presentation.program.ProgramActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/bpjstku/presentation/program/ProgramActivity$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Ljava/util/ArrayList;", "Lcom/bpjstku/presentation/program/model/ProgramInfo;", "Lkotlin/collections/b;", "p1", "Lcom/bpjstku/presentation/program/ProgramActivity$ProgramDetailType;", "p2", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Ljava/util/ArrayList;Lcom/bpjstku/presentation/program/ProgramActivity$ProgramDetailType;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, ArrayList<ProgramInfo> p1, ProgramDetailType p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            getIncrementalScaleFactor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, ProgramActivity.class, new Pair[]{TuplesKt.to("joined_programs", p1), TuplesKt.to("program_detail_type", p2)});
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 71;
        cancel = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.TuitionPaymentFragmentbindingInflater1;
        int i6 = i2 + 31;
        cancel = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 28 / 0;
        }
        return i5;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity
    public final Function1<LayoutInflater, ActivityProgramBinding> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = cancel + 75;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ProgramActivity$bindingInflater$1 programActivity$bindingInflater$1 = ProgramActivity$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i3 == 0) {
            return programActivity$bindingInflater$1;
        }
        throw null;
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ProgramInfo p0) {
        int i = 2 % 2;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("menu_program_menu", p0.b));
        Intrinsics.checkNotNullParameter(this, "");
        Intrinsics.checkNotNullParameter("event_program_menu", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter("event_program_menu", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("event_program_menu", mapMutableMapOf);
        ProgramDetailActivity.Companion companion = ProgramDetailActivity.INSTANCE;
        ProgramActivity programActivity = this;
        if (!(!Intrinsics.areEqual(p0.b, "JP"))) {
            int i2 = onTransact + 111;
            cancel = i2 % 128;
            int i3 = i2 % 2;
            p0 = ProgramInfo.b(p0, "JPN", null, 0, false, 14);
            int i4 = onTransact + 101;
            cancel = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 4;
            }
        }
        ProgramDetailActivity.Companion.b(programActivity, p0);
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        int i4 = $11 + 57;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 2;
        }
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i6 = $10 + 59;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                i2 = 1;
            } else {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                i2 = 0;
            }
            int i7 = 58224;
            while (i2 < 16) {
                int i8 = $11 + 87;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[c];
                int i10 = (c3 + i7) ^ ((c3 << 4) + ((char) (((long) d) ^ 8611973335120459638L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(g);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[c] = Integer.valueOf(c2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c4 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 47772);
                        int iKeyCodeFromString = 468 - KeyEvent.keyCodeFromString("");
                        int iKeyCodeFromString2 = 13 - KeyEvent.keyCodeFromString("");
                        Class[] clsArr = new Class[4];
                        clsArr[c] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c4, iKeyCodeFromString, iKeyCodeFromString2, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i12 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr3[c]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) f580a) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(asBinder)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getCapsMode("", 0, 0) + 47773), 468 - TextUtils.indexOf("", ""), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i7 = i12 - 40503;
                    i2++;
                    int i13 = $11 + 111;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
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
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b = (byte) 0;
                byte b2 = b;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 2322 - TextUtils.lastIndexOf("", '0', 0), 45 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1312321721, false, $$i(b, b2, b2), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x009f  */
    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ProgramInfo p0) {
        String str;
        int i;
        int i2 = 2 % 2;
        String str2 = p0.b;
        switch (str2.hashCode()) {
            case 2374:
                if (!str2.equals("JP")) {
                    str = "";
                } else {
                    JpnMainActivity.Companion companion = JpnMainActivity.INSTANCE;
                    JpnMainActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
                    str = "view_feature_menu_jp";
                }
                break;
            case 73430:
                if (!str2.equals("JHT")) {
                    str = "";
                } else {
                    OldDaySecurityActivity.Companion companion2 = OldDaySecurityActivity.INSTANCE;
                    OldDaySecurityActivity.Companion.TuitionPaymentFragmentbindingInflater1(this);
                    str = "view_feature_menu_jht";
                }
                break;
            case 73514:
                if (!str2.equals("JKK")) {
                    i = onTransact + 25;
                    cancel = i % 128;
                    int i3 = i % 2;
                    str = "";
                } else {
                    JkkServiceActivity.Companion companion3 = JkkServiceActivity.INSTANCE;
                    JkkServiceActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
                    str = "view_feature_menu_jkk";
                }
                break;
            case 73516:
                if (!str2.equals("JKM")) {
                    int i4 = onTransact + 33;
                    cancel = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 63 / 0;
                    }
                    str = "";
                } else {
                    JkmServiceActivity.Companion companion4 = JkmServiceActivity.INSTANCE;
                    JkmServiceActivity.Companion.TuitionPaymentFragmentbindingInflater1(this);
                    str = "view_feature_menu_jkm";
                }
                break;
            case 73519:
                if (!str2.equals("JKP")) {
                    i = cancel + 71;
                    onTransact = i % 128;
                    int i6 = i % 2;
                    str = "";
                } else {
                    JkpMainActivity.Companion companion5 = JkpMainActivity.INSTANCE;
                    JkpMainActivity.Companion.TuitionPaymentFragmentbindingInflater1(this);
                    int i7 = cancel + 45;
                    onTransact = i7 % 128;
                    int i8 = i7 % 2;
                    str = "view_feature_menu_jkp";
                }
                break;
            default:
                str = "";
                break;
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_view_feature_menu_program", str));
        Intrinsics.checkNotNullParameter(this, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        ArrayList<ProgramInfo> parcelableArrayListExtra;
        ProgramDetailType programDetailType;
        ProgramActivity programActivity = (ProgramActivity) objArr[0];
        int i = 2 % 2;
        Intent intent = programActivity.getIntent();
        if (intent != null) {
            parcelableArrayListExtra = intent.getParcelableArrayListExtra("joined_programs");
            int i2 = onTransact + 51;
            cancel = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 / 3;
            }
        } else {
            parcelableArrayListExtra = null;
        }
        programActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = parcelableArrayListExtra;
        Intent intent2 = programActivity.getIntent();
        if (intent2 != null) {
            int i4 = onTransact + 1;
            cancel = i4 % 128;
            int i5 = i4 % 2;
            programDetailType = (ProgramDetailType) intent2.getParcelableExtra("program_detail_type");
        } else {
            programDetailType = null;
        }
        programActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = programDetailType;
        return null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asBinder() {
        int i = 2 % 2;
        int i2 = cancel + 19;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ProgramActivity programActivity = this;
        Intrinsics.checkNotNullParameter(programActivity, "");
        programActivity.getWindow().addFlags(8192);
        TuitionPaymentFragmentbindingInflater1((Toolbar) ((ActivityProgramBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.toolbar, true);
        ((ActivityProgramBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).layoutToolbar.tvToolbarTitle.setText(getString(R.string.title_jamsostek_program));
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == ProgramDetailType.OPEN_PROGRAM_INFO) {
            RecyclerView recyclerView = ((ActivityProgramBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvProgram;
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setHasFixedSize(true);
            recyclerView.setAdapter((getTagBundle) this.a.getValue());
            return;
        }
        RecyclerView recyclerView2 = ((ActivityProgramBinding) ((ViewBinding) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue())).rvProgram;
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setAdapter((getCaptureResult) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        int i4 = cancel + 111;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = onTransact + 25;
        cancel = i2 % 128;
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
                int i3 = cancel + 113;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                getOnBackPressedDispatcher().onBackPressed();
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            throw th;
        }
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1031;
            int iRed = 15 - Color.red(0);
            byte[] bArr = $$a;
            short s = bArr[5];
            Object[] objArr2 = new Object[1];
            c(s, (byte) (s & 52), bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetBefore, longPressTimeout, iRed, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{53792, 6844, 53643, 27100, 1654, 54262, 11784, 14814, 1217, 10334, 14333, 39658, 28576, 22951, 7704, 28957, 55274, 27796, 54926, 54948, 36350, 56997, 51518, 23839}, 22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{17200, 34191, 44684, 21631, 40659, 37915, 63794, 32551, 17973, 34706, 56902, 22439, 20404, 11031, 49044, 42547, 50709, 50089}, 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
            int i2 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1031;
            int deadChar = KeyEvent.getDeadChar(0, 0) + 15;
            short s2 = (short) 51;
            Object[] objArr5 = new Object[1];
            c(s2, (byte) (s2 + 1), $$a[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, i2, deadChar, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char longPressTimeout2 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                int i3 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1030;
                int keyRepeatTimeout = 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                c((short) 103, bArr2[7], bArr2[132], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(longPressTimeout2, i3, keyRepeatTimeout, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr7[3])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_unsuccessful).substring(0, 1).length() - 1212149830;
            int i6 = ~length;
            int i7 = (~((-1023875136) | i6)) | 738658325;
            int i8 = ~(length | 1064811775);
            int i9 = 1923240678 + ((i7 | i8) * (-713)) + (i8 * 1426) + ((~(779594965 | i6)) * 713) + 1545490493;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[2])[0] = i11 ^ (i11 << 5);
            int i12 = cancel + 99;
            onTransact = i12 % 128;
            int i13 = i12 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{9354, 45726, 47915, 44402, 64106, 61382, 61080, 26792, 43715, 31031, 49581, 34047, 17515, 24403, 40347, 5691, 53547, 34880}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{12085, 39346, 49640, 55190, 2949, 6085, 6550, 57671, 52622, 28007, 39033, 42535, 27354, 22250, 65182, 56036, 6956, 57316}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1005487983};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46037 - TextUtils.indexOf((CharSequence) "", '0')), ExpandableListView.getPackedPositionType(0L) + 1134, (ViewConfiguration.getLongPressTimeout() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, 1545490493, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    int mirror = 1079 - AndroidCharacter.getMirror('0');
                    int iArgb = Color.argb(0, 0, 0, 0) + 15;
                    byte[] bArr3 = $$a;
                    short s3 = bArr3[5];
                    Object[] objArr12 = new Object[1];
                    c(s3, (byte) (s3 & 52), bArr3[7], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, mirror, iArgb, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 45994), 1117 - Gravity.getAbsoluteGravity(0, 0), ImageFormat.getBitsPerPixel(0) + 18), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                    int iIndexOf = TextUtils.indexOf("", "") + 1031;
                    int iKeyCodeFromString = 15 - KeyEvent.keyCodeFromString("");
                    byte[] bArr4 = $$a;
                    Object[] objArr13 = new Object[1];
                    c((short) 103, bArr4[7], bArr4[132], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cNormalizeMetaState, iIndexOf, iKeyCodeFromString, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{53792, 6844, 53643, 27100, 1654, 54262, 11784, 14814, 1217, 10334, 14333, 39658, 28576, 22951, 7704, 28957, 55274, 27796, 54926, 54948, 36350, 56997, 51518, 23839}, 22 - (Process.myPid() >> 22), objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{17200, 34191, 44684, 21631, 40659, 37915, 63794, 32551, 17973, 34706, 56902, 22439, 20404, 11031, 49044, 42547, 50709, 50089}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char longPressTimeout3 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        int gidForName = Process.getGidForName("") + 1032;
                        int iMakeMeasureSpec = 15 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        short s4 = (short) 51;
                        Object[] objArr16 = new Object[1];
                        c(s4, (byte) (s4 + 1), $$a[7], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(longPressTimeout3, gidForName, iMakeMeasureSpec, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                        int iAlpha = Color.alpha(0) + 1031;
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 15;
                        byte[] bArr5 = $$a;
                        short s5 = bArr5[5];
                        Object[] objArr17 = new Object[1];
                        c(s5, (byte) (s5 & 52), bArr5[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, iAlpha, scrollDefaultDelay, 1357589585, false, (String) objArr17[0], null);
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
        int i14 = ((int[]) objArr[1])[0];
        int i15 = ((int[]) objArr[3])[0];
        if (i15 == i14) {
            Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i16 = ((int[]) objArr[2])[0];
            int i17 = ((int[]) objArr[3])[0];
            int i18 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[0];
            int length2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1807055687;
            int i19 = ~length2;
            int i20 = i16 + (-31192181) + (((~(i19 | (-220829373))) | 67146904 | (~((-311427075) | length2))) * 717) + (((~(length2 | (-220829373))) | (~(i19 | (-311427075))) | 67146904) * 717);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr18[2])[0] = i22 ^ (i22 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i23 = 0;
                while (i23 < strArr3.length) {
                    arrayList.add(strArr3[i23]);
                    i23++;
                    int i24 = onTransact + 19;
                    cancel = i24 % 128;
                    int i25 = i24 % 2;
                }
            }
            int[] iArr = new int[i15];
            int i26 = i15 - 1;
            iArr[i26] = 1;
            Toast.makeText((Context) null, iArr[((i15 * i26) % 2) - 1], 1).show();
            Object[] objArr19 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i27 = ((int[]) objArr[2])[0];
            int i28 = ((int[]) objArr[3])[0];
            int i29 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[0];
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 1933656032;
            int i30 = ~iCodePointAt;
            int i31 = 1486937223 + (((~((-548331482) | i30)) | 539904833) * (-1188));
            int i32 = (~(iCodePointAt | 548331481)) | 539904833;
            int i33 = ~(792611651 | i30);
            int i34 = i27 + i31 + ((i32 | i33) * 594) + (((~(548331481 | i30)) | (-801038300) | i33) * 594);
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr19[2])[0] = i36 ^ (i36 << 5);
            int i37 = cancel + 125;
            onTransact = i37 % 128;
            int i38 = i37 % 2;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0', 0));
            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 1756;
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 23;
            short s6 = (short) 103;
            Object[] objArr20 = new Object[1];
            c(s6, (byte) (s6 & 189), $$a[7], objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cLastIndexOf, iIndexOf2, iMakeMeasureSpec2, 986134021, false, (String) objArr20[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 29944);
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1755;
                int size = 23 - View.MeasureSpec.getSize(0);
                short s7 = (short) 51;
                Object[] objArr21 = new Object[1];
                c(s7, (byte) (s7 + 1), $$a[7], objArr21);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(pressedStateDuration, keyRepeatDelay, size, 1599039318, false, (String) objArr21[0], null);
            }
            Object[] objArr22 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = new Object[]{new int[]{((int[]) objArr22[0])[0]}, new int[]{((int[]) objArr22[1])[0]}, (Object[]) objArr22[2], new int[1], (String[]) objArr22[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i39 = ~iIdentityHashCode;
            int i40 = ~(154262262 | i39);
            int i41 = (((635544673 + ((38412545 | i40) * (-712))) + (((~(iIdentityHashCode | 192674807)) | (~(i39 | (-38412546)))) * (-712))) + (((-58340164) | i40) * 712)) - 339702503;
            int i42 = (i41 << 13) ^ i41;
            int i43 = i42 ^ (i42 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0] = i43 ^ (i43 << 5);
        } else {
            Object[] objArr23 = new Object[1];
            e(new char[]{9354, 45726, 47915, 44402, 64106, 61382, 61080, 26792, 43715, 31031, 49581, 34047, 17515, 24403, 40347, 5691, 53547, 34880}, 16 - TextUtils.getOffsetAfter("", 0), objArr23);
            Class<?> cls4 = Class.forName((String) objArr23[0]);
            Object[] objArr24 = new Object[1];
            e(new char[]{12085, 39346, 49640, 55190, 2949, 6085, 6550, 57671, 52622, 28007, 39033, 42535, 27354, 22250, 65182, 56036, 6956, 57316}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.gopay_instruction_step6).substring(28, 29).length() + 15, objArr24);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr24[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr25 = {-1005487983};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b((char) (42050 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.indexOf("", "", 0, 0) + 1726, KeyEvent.getDeadChar(0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = DecorContentParent.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).newInstance(objArr25), -339702503);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cResolveSize = (char) (View.resolveSize(0, 0) + 29944);
                int i44 = 1756 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int iRed2 = 23 - Color.red(0);
                short s8 = (short) 51;
                Object[] objArr26 = new Object[1];
                c(s8, (byte) (s8 + 1), $$a[7], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cResolveSize, i44, iRed2, 1599039318, false, (String) objArr26[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
            try {
                Object[] objArr27 = new Object[1];
                e(new char[]{53792, 6844, 53643, 27100, 1654, 54262, 11784, 14814, 1217, 10334, 14333, 39658, 28576, 22951, 7704, 28957, 55274, 27796, 54926, 54948, 36350, 56997, 51518, 23839}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mandiri_instruction_step6).substring(49, 56).length() + 15, objArr27);
                Class<?> cls5 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                e(new char[]{17200, 34191, 44684, 21631, 40659, 37915, 63794, 32551, 17973, 34706, 56902, 22439, 20404, 11031, 49044, 42547, 50709, 50089}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, objArr28);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr28[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 29944);
                    int i45 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1755;
                    int i46 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22;
                    Object[] objArr29 = new Object[1];
                    c((short) 140, (byte) ($$b & 189), $$a[7], objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cMakeMeasureSpec, i45, i46, 1596667560, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cAxisFromString = (char) (29943 - MotionEvent.axisFromString(""));
                    int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1755;
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23;
                    short s9 = (short) 103;
                    Object[] objArr30 = new Object[1];
                    c(s9, (byte) (s9 & 189), $$a[7], objArr30);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cAxisFromString, keyRepeatTimeout2, maximumDrawingCacheSize, 986134021, false, (String) objArr30[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4];
            if (strArr5 != null) {
                for (String str : strArr5) {
                    arrayList2.add(str);
                }
            }
            throw null;
        }
        int i47 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[3])[0];
        Object[] objArr31 = {new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da[4]};
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i48 = ~elapsedCpuTime;
        int i49 = i47 + 1749435657 + ((~(994600837 | i48)) * (-560)) + ((~(elapsedCpuTime | 1071415247)) * (-560)) + (((~((-781998412) | i48)) | 705184001) * 560);
        int i50 = (i49 << 13) ^ i49;
        int i51 = i50 ^ (i50 >>> 17);
        ((int[]) objArr31[3])[0] = i51 ^ (i51 << 5);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws IllegalAccessException {
        ProgramActivity programActivity = (ProgramActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 59;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) calculateCameraUseCases.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i5 = ~((-331275049) | (~iFreeMemory));
        if (i4 != (((((-1472200704) | i5) | (~(331275048 | iFreeMemory))) * (-338)) - 217619160) + (((~(iFreeMemory | (-1140925656))) | i5) * 338)) {
            throw null;
        }
        int i6 = ((Field) createExtraPreview.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int iMyUid = Process.myUid();
        int i7 = (~(2090595558 | iMyUid)) | 38013441;
        int i8 = ~((~iMyUid) | (-1753924773));
        if (i6 != (-1029463246) + ((i7 | i8) * (-470)) + (((~(iMyUid | 2128608999)) | i8) * 470)) {
            throw new RuntimeException("1506231510");
        }
        super.onResume();
        int i9 = cancel + 33;
        onTransact = i9 % 128;
        int i10 = i9 % 2;
        return null;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = cancel + 121;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        int i4 = ((Field) CameraCaptureResultImageInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~iIdentityHashCode;
        if (i4 != 183490024 + (((~((-544578096) | i5)) | 538020393 | (~(1374565638 | i5))) * (-1136)) + (((~((-544578096) | iIdentityHashCode)) | (~(1374565638 | iIdentityHashCode)) | (~((-1368007937) | i5))) * (-568)) + (((~(iIdentityHashCode | (-538020394))) | (~(i5 | (-1374565639))) | (~(544578095 | i5))) * 568)) {
            throw new RuntimeException("374474876");
        }
        int i6 = ((Field) checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlDetailCellResolutionDescription).substring(0, 60).codePointAt(23) + 837432831;
        if (i6 != 568287340 + (((~((~iCodePointAt) | (-280371209))) | (~((-1783103782) | iCodePointAt))) * (-302)) + ((~((-280371209) | iCodePointAt)) * (-604)) + (((~(iCodePointAt | (-2063474990))) | (-2130667440)) * 302)) {
            int i7 = 435413828 % 2;
            throw new ArithmeticException();
        }
        super.onStart();
        int i8 = onTransact + 117;
        cancel = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a3, code lost:
    
        if (r1 != (((1724745392 + (((~((-176811417) | r4)) | 1892722747) * (-865))) + ((~(r2 | 176811416)) * 865)) + (((~(1892722747 | r4)) | (~(r4 | 176811416))) * 865))) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a5, code lost:
    
        super.onCreate(r10);
        r10 = com.bpjstku.presentation.program.ProgramActivity.onTransact + 51;
        com.bpjstku.presentation.program.ProgramActivity.cancel = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b1, code lost:
    
        if ((r10 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b4, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00bf, code lost:
    
        throw new java.lang.RuntimeException("-2036842607");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c0, code lost:
    
        r10 = (-683861534) % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c9, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0046, code lost:
    
        if (r1 == ((r7 + (((~(r4 | (-1017815727))) | (~((-187828184) | r5))) * (-672))) + (((~(1017815726 | r5)) | (-1069197312)) * 672))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0072, code lost:
    
        if (r1 == (((1388974456 + (((-285749329) | (~r4)) * (-490))) + (((~(r4 | 1249955759)) | (-1535705088)) * 490)) + 374003878)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0074, code lost:
    
        r1 = ((java.lang.reflect.Field) defpackage.checkUnsupportedFeatureCombinationAndThrow.b[0]).getInt(null);
        r2 = android.os.Process.myTid();
        r4 = ~r2;
     */
    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.ProgramActivity.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ProgramActivity programActivity, ProgramInfo programInfo) {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        cancel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(programInfo, "");
        if (programActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == ProgramDetailType.OPEN_PROGRAM_INFO) {
            programActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(programInfo);
            int i4 = cancel + 97;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        } else {
            programActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(programInfo);
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        ProgramActivity programActivity = (ProgramActivity) objArr[0];
        ProgramInfo programInfo = (ProgramInfo) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(programInfo, "");
        if (programActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == ProgramDetailType.OPEN_PROGRAM_INFO) {
            int i2 = onTransact + 75;
            cancel = i2 % 128;
            if (i2 % 2 == 0) {
                programActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(programInfo);
                throw null;
            }
            programActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(programInfo);
        } else {
            programActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(programInfo);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = cancel + 59;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0025 A[PHI: r1
  0x0025: PHI (r1v6 com.bpjstku.presentation.program.ProgramActivity) = (r1v5 com.bpjstku.presentation.program.ProgramActivity), (r1v9 com.bpjstku.presentation.program.ProgramActivity) binds: [B:8:0x0023, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ getCaptureResult b(final ProgramActivity programActivity) {
        ProgramActivity programActivity2;
        ArrayList<ProgramInfo> arrayListEmptyList;
        int i = 2 % 2;
        int i2 = onTransact + 61;
        int i3 = i2 % 128;
        cancel = i3;
        if (i2 % 2 == 0) {
            programActivity2 = programActivity;
            arrayListEmptyList = programActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i4 = 49 / 0;
            if (arrayListEmptyList == null) {
                int i5 = i3 + 99;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                arrayListEmptyList = CollectionsKt.emptyList();
            }
        } else {
            programActivity2 = programActivity;
            arrayListEmptyList = programActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (arrayListEmptyList == null) {
                int i7 = i3 + 99;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                arrayListEmptyList = CollectionsKt.emptyList();
            }
        }
        return new getCaptureResult(programActivity2, arrayListEmptyList, new Function1() { // from class: getUseCaseId
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProgramActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (ProgramInfo) obj);
            }
        });
    }

    public static /* synthetic */ getTagBundle TuitionPaymentFragmentbindingInflater1(final ProgramActivity programActivity) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 95;
        cancel = i3 % 128;
        int i4 = i3 % 2;
        ProgramActivity programActivity2 = programActivity;
        ArrayList<ProgramInfo> arrayListEmptyList = programActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (arrayListEmptyList == null) {
            int i5 = i2 + 55;
            cancel = i5 % 128;
            int i6 = i5 % 2;
            arrayListEmptyList = CollectionsKt.emptyList();
        }
        return new getTagBundle(programActivity2, arrayListEmptyList, new Function1() { // from class: getUseCaseType
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object[] objArr = {this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (ProgramInfo) obj};
                return (Unit) ProgramActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zzdm.b(), -1535015259, zzdm.b(), objArr, zzdm.b(), 1535015260, zzdm.b());
            }
        });
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(ProgramActivity programActivity, ProgramInfo programInfo) {
        int iB = zzdm.b();
        int iB2 = zzdm.b();
        return (Unit) TuitionPaymentFragmentspecialinlinedviewModeldefault2(iB, -1535015259, zzdm.b(), new Object[]{programActivity, programInfo}, iB2, 1535015260, zzdm.b());
    }

    static {
        notify = 0;
        g();
        INSTANCE = new Companion(null);
        int i = INotificationSideChannel + 17;
        notify = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        cancel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 55 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void b() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -2060308963, SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 2060308963, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.activity_save_credit_card).substring(7, 10).length() - 1232998893);
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        cancel = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void a() {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        cancel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 17 / 0;
        }
    }

    @Override // com.nbs.nucleosnucleo.presentation.BaseActivity
    public final void asInterface() {
        int i = 2 % 2;
        int i2 = cancel + 111;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -2121769066, zzdm.b(), new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, 2121769068, SyariahFaqResponse.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.bpjstku.util.viewbinding.BindingBaseActivity, com.nbs.nucleosnucleo.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        int i = 2 % 2;
        int i2 = cancel + 53;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onPause();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onTransact + 73;
        cancel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static void g() {
        f580a = (char) 36159;
        asBinder = (char) 11389;
        d = (char) 768;
        g = (char) 14920;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r7, int r8, short r9) {
        /*
            int r8 = r8 * 2
            int r8 = 1 - r8
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r0 = com.bpjstku.presentation.program.ProgramActivity.$$c
            int r9 = r9 * 2
            int r9 = 108 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r5 = r2
            r9 = r7
            goto L2a
        L17:
            r3 = r2
            r6 = r9
            r9 = r7
            r7 = r6
        L1b:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L28:
            r3 = r0[r9]
        L2a:
            int r7 = r7 + r3
            int r9 = r9 + 1
            r3 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.ProgramActivity.$$i(int, int, short):java.lang.String");
    }
}
