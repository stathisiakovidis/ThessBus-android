package com.example.iakov.thessbus;

import android.graphics.Bitmap;
import android.os.Build;
import android.support.annotation.RequiresApi;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;

import java.nio.file.FileSystems;
import java.nio.file.Path;

public class QRcode {
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void generateQRCodeImage(String text, int width, int height, String filePath) throws WriterException {
        MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
        BitMatrix bitMatrix = multiFormatWriter.encode(text, BarcodeFormat.QR_CODE, width, height);
        BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
        Bitmap bitmap = barcodeEncoder.createBitmap(bitMatrix);
        Path path = FileSystems.getDefault().getPath(filePath);
    }
}
