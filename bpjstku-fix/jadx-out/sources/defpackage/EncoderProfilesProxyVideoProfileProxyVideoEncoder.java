package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import com.bpjstku.R;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class EncoderProfilesProxyVideoProfileProxyVideoEncoder {
    private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
    public boolean TuitionPaymentFragmentbindingInflater1 = false;

    public EncoderProfilesProxyVideoProfileProxyVideoEncoder(Activity activity) {
        activity.setVolumeControlStream(3);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = activity.getApplicationContext();
    }

    public final MediaPlayer TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(3);
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: EncoderProfilesProxyVideoProfileProxyVideoEncoder.2
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                mediaPlayer2.stop();
                mediaPlayer2.release();
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: EncoderProfilesProxyVideoProfileProxyVideoEncoder.5
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                mediaPlayer2.stop();
                mediaPlayer2.release();
                return true;
            }
        });
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getResources().openRawResourceFd(R.raw.zxing_beep);
            try {
                mediaPlayer.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
                assetFileDescriptorOpenRawResourceFd.close();
                mediaPlayer.setVolume(0.1f, 0.1f);
                mediaPlayer.prepare();
                mediaPlayer.start();
                return mediaPlayer;
            } catch (Throwable th) {
                assetFileDescriptorOpenRawResourceFd.close();
                throw th;
            }
        } catch (IOException unused) {
            mediaPlayer.release();
            return null;
        }
    }
}
