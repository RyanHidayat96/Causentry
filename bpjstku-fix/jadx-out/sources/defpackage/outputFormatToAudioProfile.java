package defpackage;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class outputFormatToAudioProfile {
    static final String TuitionPaymentFragmentbindingInflater1 = "RxPermissions";
    public static final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new Object();
    private TuitionPaymentFragmentbindingInflater1<configureVideo> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @FunctionalInterface
    public interface TuitionPaymentFragmentbindingInflater1<V> {
        V TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    public outputFormatToAudioProfile(FragmentActivity fragmentActivity) {
        final FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentbindingInflater1<configureVideo>() { // from class: outputFormatToAudioProfile.5
            private configureVideo TuitionPaymentFragmentbindingInflater1;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // outputFormatToAudioProfile.TuitionPaymentFragmentbindingInflater1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public configureVideo TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
                configureVideo configurevideo;
                synchronized (this) {
                    if (this.TuitionPaymentFragmentbindingInflater1 == null) {
                        this.TuitionPaymentFragmentbindingInflater1 = outputFormatToAudioProfile.TuitionPaymentFragmentbindingInflater1(outputFormatToAudioProfile.this, supportFragmentManager);
                    }
                    configurevideo = this.TuitionPaymentFragmentbindingInflater1;
                }
                return configurevideo;
            }
        };
    }

    public outputFormatToAudioProfile(Fragment fragment) {
        final FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentbindingInflater1<configureVideo>() { // from class: outputFormatToAudioProfile.5
            private configureVideo TuitionPaymentFragmentbindingInflater1;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // outputFormatToAudioProfile.TuitionPaymentFragmentbindingInflater1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public configureVideo TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
                configureVideo configurevideo;
                synchronized (this) {
                    if (this.TuitionPaymentFragmentbindingInflater1 == null) {
                        this.TuitionPaymentFragmentbindingInflater1 = outputFormatToAudioProfile.TuitionPaymentFragmentbindingInflater1(outputFormatToAudioProfile.this, childFragmentManager);
                    }
                    configurevideo = this.TuitionPaymentFragmentbindingInflater1;
                }
                return configurevideo;
            }
        };
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: outputFormatToAudioProfile$4, reason: invalid class name */
    public class AnonymousClass4<T> implements getVideoEncoderInfoFinder<T, Boolean> {
        private /* synthetic */ String[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public AnonymousClass4(String[] strArr) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = strArr;
        }

        @Override // defpackage.getVideoEncoderInfoFinder
        public final AutoValue_VideoValidatedEncoderProfilesProxy<Boolean> TuitionPaymentFragmentspecialinlinedviewModeldefault2(VideoRecordEventStart<T> videoRecordEventStart) {
            return outputFormatToAudioProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3(outputFormatToAudioProfile.this, videoRecordEventStart, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3).buffer(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.length).flatMap(new readableMs<List<MediaSpec>, AutoValue_VideoValidatedEncoderProfilesProxy<Boolean>>() { // from class: outputFormatToAudioProfile.4.2
                @Override // defpackage.readableMs
                public final /* synthetic */ AutoValue_VideoValidatedEncoderProfilesProxy<Boolean> apply(List<MediaSpec> list) throws Exception {
                    List<MediaSpec> list2 = list;
                    if (list2.isEmpty()) {
                        return VideoRecordEventStart.empty();
                    }
                    Iterator<MediaSpec> it = list2.iterator();
                    while (it.hasNext()) {
                        if (!it.next().b) {
                            return VideoRecordEventStart.just(Boolean.FALSE);
                        }
                    }
                    return VideoRecordEventStart.just(Boolean.TRUE);
                }
            });
        }
    }

    static /* synthetic */ configureVideo TuitionPaymentFragmentbindingInflater1(outputFormatToAudioProfile outputformattoaudioprofile, FragmentManager fragmentManager) {
        String str = TuitionPaymentFragmentbindingInflater1;
        configureVideo configurevideo = (configureVideo) fragmentManager.findFragmentByTag(str);
        if (configurevideo != null) {
            return configurevideo;
        }
        configureVideo configurevideo2 = new configureVideo();
        fragmentManager.beginTransaction().add(configurevideo2, str).commitNow();
        return configurevideo2;
    }

    static /* synthetic */ VideoRecordEventStart TuitionPaymentFragmentspecialinlinedviewModeldefault3(outputFormatToAudioProfile outputformattoaudioprofile, VideoRecordEventStart videoRecordEventStart, final String[] strArr) {
        VideoRecordEventStart videoRecordEventStartJust;
        VideoRecordEventStart videoRecordEventStartMerge;
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException("RxPermissions.request/requestEach requires at least one input permission");
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                videoRecordEventStartJust = VideoRecordEventStart.just(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                break;
            }
            if (!outputformattoaudioprofile.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault2.containsKey(strArr[i])) {
                videoRecordEventStartJust = VideoRecordEventStart.empty();
                break;
            }
            i++;
        }
        if (videoRecordEventStart == null) {
            videoRecordEventStartMerge = VideoRecordEventStart.just(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        } else {
            videoRecordEventStartMerge = VideoRecordEventStart.merge(videoRecordEventStart, videoRecordEventStartJust);
        }
        return videoRecordEventStartMerge.flatMap(new readableMs<Object, VideoRecordEventStart<MediaSpec>>() { // from class: outputFormatToAudioProfile.3
            @Override // defpackage.readableMs
            public final /* synthetic */ VideoRecordEventStart<MediaSpec> apply(Object obj) throws Exception {
                return outputFormatToAudioProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3(outputFormatToAudioProfile.this, strArr);
            }
        });
    }

    static /* synthetic */ VideoRecordEventStart TuitionPaymentFragmentspecialinlinedviewModeldefault3(outputFormatToAudioProfile outputformattoaudioprofile, String[] strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        ArrayList arrayList2 = new ArrayList();
        for (String str : strArr) {
            boolean z = outputformattoaudioprofile.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3().b;
            FragmentActivity activity = outputformattoaudioprofile.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3().getActivity();
            if (activity == null) {
                throw new IllegalStateException("This fragment must be attached to an activity.");
            }
            if (activity.checkSelfPermission(str) == 0) {
                arrayList.add(VideoRecordEventStart.just(new MediaSpec(str, true, false)));
            } else {
                configureVideo configurevideoTuitionPaymentFragmentspecialinlinedviewModeldefault3 = outputformattoaudioprofile.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                FragmentActivity activity2 = configurevideoTuitionPaymentFragmentspecialinlinedviewModeldefault3.getActivity();
                if (activity2 == null) {
                    throw new IllegalStateException("This fragment must be attached to an activity.");
                }
                if (activity2.getPackageManager().isPermissionRevokedByPolicy(str, configurevideoTuitionPaymentFragmentspecialinlinedviewModeldefault3.getActivity().getPackageName())) {
                    arrayList.add(VideoRecordEventStart.just(new MediaSpec(str, false, false)));
                } else {
                    PublishSubject<MediaSpec> publishSubjectB = outputformattoaudioprofile.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(str);
                    if (publishSubjectB == null) {
                        arrayList2.add(str);
                        publishSubjectB = PublishSubject.b();
                        outputformattoaudioprofile.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault2.put(str, publishSubjectB);
                    }
                    arrayList.add(publishSubjectB);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            String[] strArr2 = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            configureVideo configurevideoTuitionPaymentFragmentspecialinlinedviewModeldefault4 = outputformattoaudioprofile.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            TextUtils.join(", ", strArr2);
            boolean z2 = configurevideoTuitionPaymentFragmentspecialinlinedviewModeldefault4.b;
            outputformattoaudioprofile.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3().requestPermissions(strArr2, 42);
        }
        return VideoRecordEventStart.concat(VideoRecordEventStart.fromIterable(arrayList));
    }
}
