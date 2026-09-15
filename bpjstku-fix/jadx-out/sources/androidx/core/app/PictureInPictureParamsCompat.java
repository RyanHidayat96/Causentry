package androidx.core.app;

import android.app.PictureInPictureParams;
import android.app.RemoteAction;
import android.graphics.Rect;
import android.os.Build;
import android.util.Rational;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\"\u0018\u00002\u00020\u0001:\u00042345Bs\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b%\u0010\u0018R\u001c\u0010&\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001a\u001a\u0004\b+\u0010\u001cR\u001c\u0010,\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001c\u00100\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/"}, d2 = {"Landroidx/core/app/PictureInPictureParamsCompat;", "", "", "p0", "Landroid/util/Rational;", "p1", "", "Landroid/app/RemoteAction;", "p2", "Landroid/graphics/Rect;", "p3", "p4", "p5", "p6", "", "p7", "p8", "<init>", "(ZLandroid/util/Rational;Ljava/util/List;Landroid/graphics/Rect;ZLandroid/app/RemoteAction;Landroid/util/Rational;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "Landroid/app/PictureInPictureParams;", "toPictureInPictureParams", "()Landroid/app/PictureInPictureParams;", "isEnabled", "Z", "()Z", "aspectRatio", "Landroid/util/Rational;", "getAspectRatio", "()Landroid/util/Rational;", "actions", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "sourceRectHint", "Landroid/graphics/Rect;", "getSourceRectHint", "()Landroid/graphics/Rect;", "isSeamlessResizeEnabled", "closeAction", "Landroid/app/RemoteAction;", "getCloseAction", "()Landroid/app/RemoteAction;", "expandedAspectRatio", "getExpandedAspectRatio", "title", "Ljava/lang/CharSequence;", "getTitle", "()Ljava/lang/CharSequence;", "subTitle", "getSubTitle", "Builder", "Api26Impl", "Api31Impl", "Api33Impl"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PictureInPictureParamsCompat {
    private final List<RemoteAction> actions;
    private final Rational aspectRatio;
    private final RemoteAction closeAction;
    private final Rational expandedAspectRatio;
    private final boolean isEnabled;
    private final boolean isSeamlessResizeEnabled;
    private final Rect sourceRectHint;
    private final CharSequence subTitle;
    private final CharSequence title;

    public PictureInPictureParamsCompat(boolean z, Rational rational, List<RemoteAction> list, Rect rect, boolean z2, RemoteAction remoteAction, Rational rational2, CharSequence charSequence, CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.isEnabled = z;
        this.aspectRatio = rational;
        this.actions = list;
        this.sourceRectHint = rect;
        this.isSeamlessResizeEnabled = z2;
        this.closeAction = remoteAction;
        this.expandedAspectRatio = rational2;
        this.title = charSequence;
        this.subTitle = charSequence2;
    }

    /* JADX INFO: renamed from: isEnabled, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final Rational getAspectRatio() {
        return this.aspectRatio;
    }

    public /* synthetic */ PictureInPictureParamsCompat(boolean z, Rational rational, List list, Rect rect, boolean z2, RemoteAction remoteAction, Rational rational2, CharSequence charSequence, CharSequence charSequence2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : rational, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : rect, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : remoteAction, (i & 64) != 0 ? null : rational2, (i & 128) != 0 ? null : charSequence, (i & 256) == 0 ? charSequence2 : null);
    }

    public final List<RemoteAction> getActions() {
        return this.actions;
    }

    public final Rect getSourceRectHint() {
        return this.sourceRectHint;
    }

    /* JADX INFO: renamed from: isSeamlessResizeEnabled, reason: from getter */
    public final boolean getIsSeamlessResizeEnabled() {
        return this.isSeamlessResizeEnabled;
    }

    public final RemoteAction getCloseAction() {
        return this.closeAction;
    }

    public final Rational getExpandedAspectRatio() {
        return this.expandedAspectRatio;
    }

    public final CharSequence getTitle() {
        return this.title;
    }

    public final CharSequence getSubTitle() {
        return this.subTitle;
    }

    public final PictureInPictureParams toPictureInPictureParams() {
        if (Build.VERSION.SDK_INT >= 33) {
            return Api33Impl.create(this.aspectRatio, this.actions, this.sourceRectHint, this.isEnabled, this.isSeamlessResizeEnabled, this.expandedAspectRatio, this.closeAction, this.title, this.subTitle);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.create(this.aspectRatio, this.actions, this.sourceRectHint, this.isEnabled, this.isSeamlessResizeEnabled);
        }
        return Api26Impl.create(this.aspectRatio, this.actions, this.sourceRectHint);
    }

    public PictureInPictureParamsCompat() {
        this(false, null, null, null, false, null, null, null, null, 511, null);
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0007J\u0019\u0010\u0013\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0015\u0010\nJ\u0019\u0010\u0017\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001eR\u0018\u0010&\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010 R\u0018\u0010)\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010*"}, d2 = {"Landroidx/core/app/PictureInPictureParamsCompat$Builder;", "", "<init>", "()V", "", "p0", "setEnabled", "(Z)Landroidx/core/app/PictureInPictureParamsCompat$Builder;", "Landroid/util/Rational;", "setAspectRatio", "(Landroid/util/Rational;)Landroidx/core/app/PictureInPictureParamsCompat$Builder;", "", "Landroid/app/RemoteAction;", "setActions", "(Ljava/util/List;)Landroidx/core/app/PictureInPictureParamsCompat$Builder;", "Landroid/graphics/Rect;", "setSourceRectHint", "(Landroid/graphics/Rect;)Landroidx/core/app/PictureInPictureParamsCompat$Builder;", "setSeamlessResizeEnabled", "setCloseAction", "(Landroid/app/RemoteAction;)Landroidx/core/app/PictureInPictureParamsCompat$Builder;", "setExpandedAspectRatio", "", "setTitle", "(Ljava/lang/CharSequence;)Landroidx/core/app/PictureInPictureParamsCompat$Builder;", "setSubTitle", "Landroidx/core/app/PictureInPictureParamsCompat;", "build", "()Landroidx/core/app/PictureInPictureParamsCompat;", "enabled", "Z", "aspectRatio", "Landroid/util/Rational;", "actions", "Ljava/util/List;", "sourceRectHint", "Landroid/graphics/Rect;", "seamlessResizeEnabled", "closeAction", "Landroid/app/RemoteAction;", "expandedAspectRatio", "title", "Ljava/lang/CharSequence;", "subTitle"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        private Rational aspectRatio;
        private RemoteAction closeAction;
        private Rational expandedAspectRatio;
        private boolean seamlessResizeEnabled;
        private Rect sourceRectHint;
        private CharSequence subTitle;
        private CharSequence title;
        private boolean enabled = true;
        private List<RemoteAction> actions = CollectionsKt.emptyList();

        public final Builder setEnabled(boolean p0) {
            this.enabled = p0;
            return this;
        }

        public final Builder setAspectRatio(Rational p0) {
            this.aspectRatio = p0;
            return this;
        }

        public final Builder setActions(List<RemoteAction> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.actions = p0;
            return this;
        }

        public final Builder setSourceRectHint(Rect p0) {
            this.sourceRectHint = p0;
            return this;
        }

        public final Builder setSeamlessResizeEnabled(boolean p0) {
            this.seamlessResizeEnabled = p0;
            return this;
        }

        public final Builder setCloseAction(RemoteAction p0) {
            this.closeAction = p0;
            return this;
        }

        public final Builder setExpandedAspectRatio(Rational p0) {
            this.expandedAspectRatio = p0;
            return this;
        }

        public final Builder setTitle(CharSequence p0) {
            this.title = p0;
            return this;
        }

        public final Builder setSubTitle(CharSequence p0) {
            this.subTitle = p0;
            return this;
        }

        public final PictureInPictureParamsCompat build() {
            return new PictureInPictureParamsCompat(this.enabled, this.aspectRatio, this.actions, this.sourceRectHint, this.seamlessResizeEnabled, this.closeAction, this.expandedAspectRatio, this.title, this.subTitle);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/core/app/PictureInPictureParamsCompat$Api26Impl;", "", "<init>", "()V", "Landroid/util/Rational;", "p0", "", "Landroid/app/RemoteAction;", "p1", "Landroid/graphics/Rect;", "p2", "Landroid/app/PictureInPictureParams;", "create", "(Landroid/util/Rational;Ljava/util/List;Landroid/graphics/Rect;)Landroid/app/PictureInPictureParams;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Api26Impl {
        public static final Api26Impl INSTANCE = new Api26Impl();

        private Api26Impl() {
        }

        @JvmStatic
        public static final PictureInPictureParams create(Rational p0, List<RemoteAction> p1, Rect p2) {
            Intrinsics.checkNotNullParameter(p1, "");
            PictureInPictureParams pictureInPictureParamsBuild = new PictureInPictureParams.Builder().setAspectRatio(p0).setActions(p1).setSourceRectHint(p2).build();
            Intrinsics.checkNotNullExpressionValue(pictureInPictureParamsBuild, "");
            return pictureInPictureParamsBuild;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/core/app/PictureInPictureParamsCompat$Api31Impl;", "", "<init>", "()V", "Landroid/util/Rational;", "p0", "", "Landroid/app/RemoteAction;", "p1", "Landroid/graphics/Rect;", "p2", "", "p3", "p4", "Landroid/app/PictureInPictureParams;", "create", "(Landroid/util/Rational;Ljava/util/List;Landroid/graphics/Rect;ZZ)Landroid/app/PictureInPictureParams;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Api31Impl {
        public static final Api31Impl INSTANCE = new Api31Impl();

        private Api31Impl() {
        }

        @JvmStatic
        public static final PictureInPictureParams create(Rational p0, List<RemoteAction> p1, Rect p2, boolean p3, boolean p4) {
            Intrinsics.checkNotNullParameter(p1, "");
            PictureInPictureParams pictureInPictureParamsBuild = new PictureInPictureParams.Builder().setAspectRatio(p0).setActions(p1).setSourceRectHint(p2).setAutoEnterEnabled(p3).setSeamlessResizeEnabled(p4).build();
            Intrinsics.checkNotNullExpressionValue(pictureInPictureParamsBuild, "");
            return pictureInPictureParamsBuild;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\u0014\u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/core/app/PictureInPictureParamsCompat$Api33Impl;", "", "<init>", "()V", "Landroid/util/Rational;", "p0", "", "Landroid/app/RemoteAction;", "p1", "Landroid/graphics/Rect;", "p2", "", "p3", "p4", "p5", "p6", "", "p7", "p8", "Landroid/app/PictureInPictureParams;", "create", "(Landroid/util/Rational;Ljava/util/List;Landroid/graphics/Rect;ZZLandroid/util/Rational;Landroid/app/RemoteAction;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/app/PictureInPictureParams;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Api33Impl {
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        @JvmStatic
        public static final PictureInPictureParams create(Rational p0, List<RemoteAction> p1, Rect p2, boolean p3, boolean p4, Rational p5, RemoteAction p6, CharSequence p7, CharSequence p8) {
            Intrinsics.checkNotNullParameter(p1, "");
            PictureInPictureParams pictureInPictureParamsBuild = new PictureInPictureParams.Builder().setAspectRatio(p0).setActions(p1).setSourceRectHint(p2).setAutoEnterEnabled(p3).setSeamlessResizeEnabled(p4).setExpandedAspectRatio(p5).setCloseAction(p6).setTitle(p7).setSubtitle(p8).build();
            Intrinsics.checkNotNullExpressionValue(pictureInPictureParamsBuild, "");
            return pictureInPictureParamsBuild;
        }
    }
}
