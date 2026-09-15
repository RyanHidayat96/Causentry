package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder;
import defpackage.FileOutputOptions;
import defpackage.SurfaceViewImplementation;
import defpackage.getProfiles;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class MediaStoreRequestHandler extends getProfiles {
    private static final String[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {"orientation"};

    MediaStoreRequestHandler(Context context) {
        super(context);
    }

    @Override // defpackage.getProfiles, defpackage.FileOutputOptions
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder) {
        Uri uri = fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault;
        return FirebaseAnalytics.Param.CONTENT.equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    @Override // defpackage.getProfiles, defpackage.FileOutputOptions
    public final FileOutputOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2(FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder, int i) throws IOException {
        PicassoKind picassoKind;
        Bitmap thumbnail;
        ContentResolver contentResolver = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getContentResolver();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(contentResolver, fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault);
        String type = contentResolver.getType(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault);
        boolean z = type != null && type.startsWith("video/");
        if (fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.RemoteActionCompatParcelizer != 0 || fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.getInterfaceDescriptor != 0) {
            int i2 = fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.RemoteActionCompatParcelizer;
            int i3 = fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.getInterfaceDescriptor;
            if (i2 <= PicassoKind.MICRO.width && i3 <= PicassoKind.MICRO.height) {
                picassoKind = PicassoKind.MICRO;
            } else if (i2 <= PicassoKind.MINI.width && i3 <= PicassoKind.MINI.height) {
                picassoKind = PicassoKind.MINI;
            } else {
                picassoKind = PicassoKind.FULL;
            }
            PicassoKind picassoKind2 = picassoKind;
            if (!z && picassoKind2 == PicassoKind.FULL) {
                return new FileOutputOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(null, SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getContentResolver().openInputStream(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault)), Picasso.LoadedFrom.DISK, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
            long id2 = ContentUris.parseId(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault);
            BitmapFactory.Options optionsB = b(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder);
            optionsB.inJustDecodeBounds = true;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.RemoteActionCompatParcelizer, fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.getInterfaceDescriptor, picassoKind2.width, picassoKind2.height, optionsB, fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder);
            if (z) {
                thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, id2, picassoKind2 == PicassoKind.FULL ? 1 : picassoKind2.androidKind, optionsB);
            } else {
                thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, id2, picassoKind2.androidKind, optionsB);
            }
            if (thumbnail != null) {
                return new FileOutputOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(thumbnail, null, Picasso.LoadedFrom.DISK, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        }
        return new FileOutputOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(null, SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getContentResolver().openInputStream(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault)), Picasso.LoadedFrom.DISK, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2(ContentResolver contentResolver, Uri uri) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, TuitionPaymentFragmentspecialinlinedviewModeldefault3, null, null, null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                return cursorQuery.getInt(0);
            }
            return 0;
        } catch (RuntimeException unused) {
            return 0;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    enum PicassoKind {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);

        final int androidKind;
        final int height;
        final int width;

        PicassoKind(int i, int i2, int i3) {
            this.androidKind = i;
            this.width = i2;
            this.height = i3;
        }
    }
}
