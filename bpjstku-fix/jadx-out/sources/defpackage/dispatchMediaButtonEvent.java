package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes6.dex */
public final class dispatchMediaButtonEvent implements getPlaybackInfo, setMediaController {
    private final MergePaths TuitionPaymentFragmentbindingInflater1;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Path TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new Path();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f895a = new Path();
    private final Path b = new Path();
    private final List<getPlaybackInfo> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ArrayList();

    public dispatchMediaButtonEvent(MergePaths mergePaths) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mergePaths.b;
        this.TuitionPaymentFragmentbindingInflater1 = mergePaths;
    }

    @Override // defpackage.setMediaController
    public final void b(ListIterator<setRepeatMode> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            setRepeatMode setrepeatmodePrevious = listIterator.previous();
            if (setrepeatmodePrevious instanceof getPlaybackInfo) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add((getPlaybackInfo) setrepeatmodePrevious);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.setRepeatMode
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<setRepeatMode> list, List<setRepeatMode> list2) {
        for (int i = 0; i < this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size(); i++) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault1(list, list2);
        }
    }

    @Override // defpackage.getPlaybackInfo
    public final Path TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        this.b.reset();
        if (this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            return this.b;
        }
        int i = AnonymousClass5.TuitionPaymentFragmentspecialinlinedviewModeldefault1[this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.ordinal()];
        if (i == 1) {
            for (int i2 = 0; i2 < this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size(); i2++) {
                this.b.addPath(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i2).TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            }
        } else if (i == 2) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(Path.Op.UNION);
        } else if (i == 3) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(Path.Op.INTERSECT);
        } else if (i == 5) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(Path.Op.XOR);
        }
        return this.b;
    }

    /* JADX INFO: renamed from: dispatchMediaButtonEvent$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        static {
            int[] iArr = new int[MergePaths.MergePathsMode.values().length];
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iArr;
            try {
                iArr[MergePaths.MergePathsMode.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1[MergePaths.MergePathsMode.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1[MergePaths.MergePathsMode.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1[MergePaths.MergePathsMode.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1[MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // defpackage.setRepeatMode
    public final String b() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Path.Op op) {
        Matrix matrixTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Matrix matrixTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.f895a.reset();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.reset();
        for (int size = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size() - 1; size > 0; size--) {
            getPlaybackInfo getplaybackinfo = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(size);
            if (getplaybackinfo instanceof skipToQueueItem) {
                skipToQueueItem skiptoqueueitem = (skipToQueueItem) getplaybackinfo;
                List<getPlaybackInfo> listTuitionPaymentFragmentbindingInflater1 = skiptoqueueitem.TuitionPaymentFragmentbindingInflater1();
                for (int size2 = listTuitionPaymentFragmentbindingInflater1.size() - 1; size2 >= 0; size2--) {
                    Path pathTuitionPaymentFragmentspecialinlinedviewModeldefault2 = listTuitionPaymentFragmentbindingInflater1.get(size2).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    MediaControllerCompatCallbackStubCompat mediaControllerCompatCallbackStubCompat = skiptoqueueitem.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (mediaControllerCompatCallbackStubCompat != null) {
                        matrixTuitionPaymentFragmentspecialinlinedviewModeldefault3 = mediaControllerCompatCallbackStubCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    } else {
                        skiptoqueueitem.TuitionPaymentFragmentspecialinlinedviewModeldefault2.reset();
                        matrixTuitionPaymentFragmentspecialinlinedviewModeldefault3 = skiptoqueueitem.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    }
                    pathTuitionPaymentFragmentspecialinlinedviewModeldefault2.transform(matrixTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    this.f895a.addPath(pathTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
            } else {
                this.f895a.addPath(getplaybackinfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            }
        }
        getPlaybackInfo getplaybackinfo2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(0);
        if (getplaybackinfo2 instanceof skipToQueueItem) {
            skipToQueueItem skiptoqueueitem2 = (skipToQueueItem) getplaybackinfo2;
            List<getPlaybackInfo> listTuitionPaymentFragmentbindingInflater2 = skiptoqueueitem2.TuitionPaymentFragmentbindingInflater1();
            for (int i = 0; i < listTuitionPaymentFragmentbindingInflater2.size(); i++) {
                Path pathTuitionPaymentFragmentspecialinlinedviewModeldefault3 = listTuitionPaymentFragmentbindingInflater2.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                MediaControllerCompatCallbackStubCompat mediaControllerCompatCallbackStubCompat2 = skiptoqueueitem2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (mediaControllerCompatCallbackStubCompat2 != null) {
                    matrixTuitionPaymentFragmentspecialinlinedviewModeldefault2 = mediaControllerCompatCallbackStubCompat2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                } else {
                    skiptoqueueitem2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.reset();
                    matrixTuitionPaymentFragmentspecialinlinedviewModeldefault2 = skiptoqueueitem2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                }
                pathTuitionPaymentFragmentspecialinlinedviewModeldefault3.transform(matrixTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.addPath(pathTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } else {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.set(getplaybackinfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        }
        this.b.op(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.f895a, op);
    }
}
