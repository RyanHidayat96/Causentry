package defpackage;

import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B,\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000eø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!"}, d2 = {"LgetPacket;", "Lkotlin/Function0;", "", "p0", "Landroidx/compose/ui/semantics/Role;", "p1", "", "p2", "<init>", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/semantics/Role;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "invoke", "()Ljava/lang/Object;", "b", "Lkotlin/jvm/functions/Function0;", "TuitionPaymentFragmentbindingInflater1", "Landroidx/compose/ui/semantics/Role;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class getPacket implements Function0<Object> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private Role TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function0<Object> TuitionPaymentFragmentbindingInflater1;

    private getPacket(Function0<? extends Object> function0, Role role, String str) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.TuitionPaymentFragmentbindingInflater1 = function0;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = role;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("ClickableCompose");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sb.toString();
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String string;
        String strM6142toStringimpl;
        String string2;
        String strM6142toStringimpl2;
        if (!SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1.get()) {
            return this.TuitionPaymentFragmentbindingInflater1.invoke();
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            isVirtualCamera isvirtualcamera = isVirtualCamera.INSTANCE;
            Object objTuitionPaymentFragmentbindingInflater1 = isVirtualCamera.TuitionPaymentFragmentbindingInflater1();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = objTuitionPaymentFragmentbindingInflater1 instanceof Role ? (Role) objTuitionPaymentFragmentbindingInflater1 : null;
        }
        UseCaseGroupBuilder useCaseGroupBuilder = new UseCaseGroupBuilder(SurfaceRequestExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Image2JpegBytes image2JpegBytes = new Image2JpegBytes();
        Function0<Object> function0 = this.TuitionPaymentFragmentbindingInflater1;
        String str = "component";
        if (function0 instanceof getRequestEdge) {
            ToggleableState toggleableStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ((getRequestEdge) function0).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            Intrinsics.checkNotNullExpressionValue(toggleableStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            Role role = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String strTuitionPaymentFragmentbindingInflater1 = ((getRequestEdge) this.TuitionPaymentFragmentbindingInflater1).TuitionPaymentFragmentbindingInflater1();
            Intrinsics.checkNotNullExpressionValue(strTuitionPaymentFragmentbindingInflater1, "");
            getEdge getedge = new getEdge(toggleableStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, role, strTuitionPaymentFragmentbindingInflater1, null);
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("onUA: ".concat(String.valueOf(getedge)));
            }
            getPostviewImageFormat getpostviewimageformat = new getPostviewImageFormat(useCaseGroupBuilder, image2JpegBytes, getedge, isVirtualCamera.INSTANCE.b());
            Function0<Object> function1 = this.TuitionPaymentFragmentbindingInflater1;
            Intrinsics.checkNotNullParameter(function1, "");
            getPostviewSurface getpostviewsurface = getpostviewimageformat.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            getEdge getedge2 = getpostviewimageformat.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str2 = getpostviewimageformat.b;
            Intrinsics.checkNotNullParameter(getedge2, "");
            Role role2 = getedge2.b;
            if (role2 != null && (strM6142toStringimpl2 = Role.m6142toStringimpl(role2.getValue())) != null) {
                str = strM6142toStringimpl2;
            }
            if (str2 != null) {
                string2 = "Touch on ".concat(String.valueOf(str2));
            } else {
                StringBuilder sb = new StringBuilder("Touch on ");
                sb.append(str);
                sb.append(" with function ");
                sb.append(StringsKt.substringAfterLast$default(getedge2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, '.', (String) null, 2, (Object) null));
                string2 = sb.toString();
            }
            CaptureNodeIn captureNodeInTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getpostviewsurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string2, getpostviewimageformat.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            captureNodeInTuitionPaymentFragmentspecialinlinedviewModeldefault2.b("role", String.valueOf(getpostviewimageformat.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b));
            captureNodeInTuitionPaymentFragmentspecialinlinedviewModeldefault2.b("function", getpostviewimageformat.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            captureNodeInTuitionPaymentFragmentspecialinlinedviewModeldefault2.b("fromState", getpostviewimageformat.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.name());
            captureNodeInTuitionPaymentFragmentspecialinlinedviewModeldefault2.b("type", "toggle");
            Object objInvoke = function1.invoke();
            captureNodeInTuitionPaymentFragmentspecialinlinedviewModeldefault2.b();
            return objInvoke;
        }
        getPostviewSize getpostviewsize = new getPostviewSize(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, function0, null);
        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("onUA: ".concat(String.valueOf(getpostviewsize)));
        }
        getInputFormat getinputformat = new getInputFormat(useCaseGroupBuilder, image2JpegBytes, getpostviewsize, isVirtualCamera.INSTANCE.b());
        Function0<Object> function2 = this.TuitionPaymentFragmentbindingInflater1;
        Intrinsics.checkNotNullParameter(function2, "");
        getPostviewSurface getpostviewsurface2 = getinputformat.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        getPostviewSize getpostviewsize2 = getinputformat.TuitionPaymentFragmentbindingInflater1;
        String str3 = getinputformat.b;
        Intrinsics.checkNotNullParameter(getpostviewsize2, "");
        Role role3 = getpostviewsize2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (role3 != null && (strM6142toStringimpl = Role.m6142toStringimpl(role3.getValue())) != null) {
            str = strM6142toStringimpl;
        }
        if (str3 != null) {
            string = "Touch on ".concat(String.valueOf(str3));
        } else {
            StringBuilder sb2 = new StringBuilder("Touch on ");
            sb2.append(str);
            sb2.append(" with function ");
            String name = getpostviewsize2.b.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            sb2.append(StringsKt.substringAfterLast$default(name, '.', (String) null, 2, (Object) null));
            string = sb2.toString();
        }
        CaptureNodeIn captureNodeInTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getpostviewsurface2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string, getinputformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        captureNodeInTuitionPaymentFragmentspecialinlinedviewModeldefault3.b("role", String.valueOf(getinputformat.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
        captureNodeInTuitionPaymentFragmentspecialinlinedviewModeldefault3.b("function", getinputformat.TuitionPaymentFragmentbindingInflater1.b.getClass().getName());
        captureNodeInTuitionPaymentFragmentspecialinlinedviewModeldefault3.b("type", getinputformat.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        Object objInvoke2 = function2.invoke();
        captureNodeInTuitionPaymentFragmentspecialinlinedviewModeldefault3.b();
        return objInvoke2;
    }

    public /* synthetic */ getPacket(Function0 function0, Role role, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, role, str);
    }
}
