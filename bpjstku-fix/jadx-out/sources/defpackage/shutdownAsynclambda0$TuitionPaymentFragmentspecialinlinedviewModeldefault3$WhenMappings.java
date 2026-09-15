package defpackage;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class shutdownAsynclambda0$TuitionPaymentFragmentspecialinlinedviewModeldefault3$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[PlayerConstants.PlayerState.values().length];
        try {
            iArr[PlayerConstants.PlayerState.ENDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlayerConstants.PlayerState.PAUSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlayerConstants.PlayerState.PLAYING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
