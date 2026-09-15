package com.pierfrancescosoffritti.androidyoutubeplayer.core.player;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
public final class PlayerConstants {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlaybackQuality;", "", "<init>", "(Ljava/lang/String;I)V", "g", "asBinder", "a", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum PlaybackQuality {
        UNKNOWN,
        SMALL,
        MEDIUM,
        LARGE,
        HD720,
        HD1080,
        HIGH_RES,
        DEFAULT
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlaybackRate;", "", "<init>", "(Ljava/lang/String;I)V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "asInterface", "a", "d"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum PlaybackRate {
        UNKNOWN,
        RATE_0_25,
        RATE_0_5,
        RATE_0_75,
        RATE_1,
        RATE_1_25,
        RATE_1_5,
        RATE_1_75,
        RATE_2
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlayerError;", "", "<init>", "(Ljava/lang/String;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum PlayerError {
        UNKNOWN,
        INVALID_PARAMETER_IN_REQUEST,
        HTML_5_PLAYER,
        VIDEO_NOT_FOUND,
        VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/PlayerConstants$PlayerState;", "", "<init>", "(Ljava/lang/String;I)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asBinder", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1", "b", "asInterface"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum PlayerState {
        UNKNOWN,
        UNSTARTED,
        ENDED,
        PLAYING,
        PAUSED,
        BUFFERING,
        VIDEO_CUED
    }
}
