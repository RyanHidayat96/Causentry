package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import defpackage.getOutputOption;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class ParcelFileDescriptorRewinder implements getOutputOption<ParcelFileDescriptor> {
    public final InternalRewinder TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.getOutputOption
    public final void TuitionPaymentFragmentbindingInflater1() {
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new InternalRewinder(parcelFileDescriptor);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements getOutputOption.TuitionPaymentFragmentspecialinlinedviewModeldefault1<ParcelFileDescriptor> {
        @Override // getOutputOption.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final /* synthetic */ getOutputOption<ParcelFileDescriptor> TuitionPaymentFragmentspecialinlinedviewModeldefault2(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // getOutputOption.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final Class<ParcelFileDescriptor> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return ParcelFileDescriptor.class;
        }
    }

    public static final class InternalRewinder {
        private final ParcelFileDescriptor TuitionPaymentFragmentbindingInflater1;

        InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.TuitionPaymentFragmentbindingInflater1 = parcelFileDescriptor;
        }

        public final ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.TuitionPaymentFragmentbindingInflater1.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.TuitionPaymentFragmentbindingInflater1;
            } catch (ErrnoException e2) {
                throw new IOException(e2);
            }
        }
    }

    @Override // defpackage.getOutputOption
    public final /* synthetic */ ParcelFileDescriptor TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws IOException {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.rewind();
    }
}
