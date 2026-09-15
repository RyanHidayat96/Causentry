package androidx.camera.video.internal.audio;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
interface AudioStreamFactory {
    AudioStream create(AudioSettings audioSettings, Context context) throws AudioStream.AudioStreamException;
}
