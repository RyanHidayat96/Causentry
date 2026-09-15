package androidx.p013savedstate.p017serialization;

import defpackage.PreviewViewImplementationOnSurfaceNotInUseListener;
import defpackage.waitForNextFrame;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0016B'\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/savedstate/serialization/SavedStateConfiguration;", "", "LPreviewViewImplementationOnSurfaceNotInUseListener;", "p0", "", "p1", "", "p2", "<init>", "(LPreviewViewImplementationOnSurfaceNotInUseListener;IZ)V", "serializersModule", "LPreviewViewImplementationOnSurfaceNotInUseListener;", "getSerializersModule", "()LPreviewViewImplementationOnSurfaceNotInUseListener;", "classDiscriminatorMode", "I", "getClassDiscriminatorMode", "()I", "encodeDefaults", "Z", "getEncodeDefaults", "()Z", "Companion", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SavedStateConfiguration {
    public static final SavedStateConfiguration DEFAULT = new SavedStateConfiguration(null, 0, false, 7, null);
    private final int classDiscriminatorMode;
    private final boolean encodeDefaults;
    private final PreviewViewImplementationOnSurfaceNotInUseListener serializersModule;

    private SavedStateConfiguration(PreviewViewImplementationOnSurfaceNotInUseListener previewViewImplementationOnSurfaceNotInUseListener, int i, boolean z) {
        this.serializersModule = previewViewImplementationOnSurfaceNotInUseListener;
        this.classDiscriminatorMode = i;
        this.encodeDefaults = z;
    }

    /* synthetic */ SavedStateConfiguration(PreviewViewImplementationOnSurfaceNotInUseListener previewViewImplementationOnSurfaceNotInUseListener, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? SavedStateConfigurationKt.DEFAULT_SERIALIZERS_MODULE : previewViewImplementationOnSurfaceNotInUseListener, (i2 & 2) != 0 ? 2 : i, (i2 & 4) != 0 ? false : z);
    }

    public final PreviewViewImplementationOnSurfaceNotInUseListener getSerializersModule() {
        return this.serializersModule;
    }

    public final int getClassDiscriminatorMode() {
        return this.classDiscriminatorMode;
    }

    public final boolean getEncodeDefaults() {
        return this.encodeDefaults;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\t\u001a\u00020\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u0010\u001a\u00020\u000f8\u0007@\u0007X\u0086\u000e¢\u0006\u0018\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0019\u001a\u00020\u00188\u0007@\u0007X\u0086\u000e¢\u0006\u0018\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/savedstate/serialization/SavedStateConfiguration$Builder;", "", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "p0", "<init>", "(Landroidx/savedstate/serialization/SavedStateConfiguration;)V", "build$savedstate_release", "()Landroidx/savedstate/serialization/SavedStateConfiguration;", "LPreviewViewImplementationOnSurfaceNotInUseListener;", "serializersModule", "LPreviewViewImplementationOnSurfaceNotInUseListener;", "getSerializersModule", "()LPreviewViewImplementationOnSurfaceNotInUseListener;", "setSerializersModule", "(LPreviewViewImplementationOnSurfaceNotInUseListener;)V", "", "encodeDefaults", "Z", "getEncodeDefaults", "()Z", "setEncodeDefaults", "(Z)V", "getEncodeDefaults$annotations", "()V", "", "classDiscriminatorMode", "I", "getClassDiscriminatorMode", "()I", "setClassDiscriminatorMode", "(I)V", "getClassDiscriminatorMode$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private int classDiscriminatorMode;
        private boolean encodeDefaults;
        private PreviewViewImplementationOnSurfaceNotInUseListener serializersModule;

        public static /* synthetic */ void getClassDiscriminatorMode$annotations() {
        }

        public static /* synthetic */ void getEncodeDefaults$annotations() {
        }

        public Builder(SavedStateConfiguration savedStateConfiguration) {
            Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
            this.serializersModule = savedStateConfiguration.getSerializersModule();
            this.encodeDefaults = savedStateConfiguration.getEncodeDefaults();
            this.classDiscriminatorMode = savedStateConfiguration.getClassDiscriminatorMode();
        }

        public final PreviewViewImplementationOnSurfaceNotInUseListener getSerializersModule() {
            return this.serializersModule;
        }

        public final void setSerializersModule(PreviewViewImplementationOnSurfaceNotInUseListener previewViewImplementationOnSurfaceNotInUseListener) {
            Intrinsics.checkNotNullParameter(previewViewImplementationOnSurfaceNotInUseListener, "");
            this.serializersModule = previewViewImplementationOnSurfaceNotInUseListener;
        }

        public final boolean getEncodeDefaults() {
            return this.encodeDefaults;
        }

        public final void setEncodeDefaults(boolean z) {
            this.encodeDefaults = z;
        }

        public final int getClassDiscriminatorMode() {
            return this.classDiscriminatorMode;
        }

        public final void setClassDiscriminatorMode(int i) {
            this.classDiscriminatorMode = i;
        }

        public final SavedStateConfiguration build$savedstate_release() {
            return new SavedStateConfiguration(waitForNextFrame.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SavedStateConfigurationKt.DEFAULT_SERIALIZERS_MODULE, this.serializersModule), this.classDiscriminatorMode, this.encodeDefaults, null);
        }
    }

    public /* synthetic */ SavedStateConfiguration(PreviewViewImplementationOnSurfaceNotInUseListener previewViewImplementationOnSurfaceNotInUseListener, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(previewViewImplementationOnSurfaceNotInUseListener, i, z);
    }
}
