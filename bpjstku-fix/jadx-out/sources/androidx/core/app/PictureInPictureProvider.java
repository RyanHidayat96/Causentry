package androidx.core.app;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/core/app/PictureInPictureProvider;", "Landroidx/core/app/OnPictureInPictureModeChangedProvider;", "Landroidx/core/app/OnPictureInPictureUiStateChangedProvider;", "Landroidx/core/app/OnUserLeaveHintProvider;", "Landroidx/core/app/PictureInPictureParamsCompat;", "p0", "", "enterPictureInPictureMode", "(Landroidx/core/app/PictureInPictureParamsCompat;)V", "setPictureInPictureParams"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PictureInPictureProvider extends OnPictureInPictureModeChangedProvider, OnPictureInPictureUiStateChangedProvider, OnUserLeaveHintProvider {
    void enterPictureInPictureMode(PictureInPictureParamsCompat p0);

    void setPictureInPictureParams(PictureInPictureParamsCompat p0);
}
