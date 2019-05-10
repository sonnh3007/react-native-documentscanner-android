package com.documentscanner.helpers;

import org.opencv.core.Mat;

/**
 * Created by allgood on 06/03/16.
 */
public class PreviewFrame {

  private final boolean previewOnly;
  private Mat frame;
  private boolean autoMode;
  private boolean enableCapture;
  private boolean manualCapture;

  public PreviewFrame(Mat frame , boolean autoMode , boolean previewOnly) {
      this.frame = frame;
      this.autoMode = autoMode;
      this.previewOnly = previewOnly;
  }

  public PreviewFrame(Mat frame , boolean autoMode , boolean previewOnly, boolean enableCapture) {
    this.frame = frame;
    this.autoMode = autoMode;
    this.previewOnly = previewOnly;
    this.enableCapture = enableCapture;
  }

  public PreviewFrame(Mat frame , boolean autoMode , boolean previewOnly, boolean enableCapture, boolean manualCapture) {
    this.frame = frame;
    this.autoMode = autoMode;
    this.previewOnly = previewOnly;
    this.enableCapture = enableCapture;
    this.manualCapture = manualCapture;
  }

  public Mat getFrame() {
        return frame;
    }

    public void setFrame(Mat frame) {
        this.frame = frame;
    }

    public boolean isAutoMode() {
        return autoMode;
    }

    public boolean isPreviewOnly() {
        return previewOnly;
    }

    public void setAutoMode(boolean autoMode) {
        this.autoMode = autoMode;
    }

  public boolean isEnableCapture() {
    return enableCapture;
  }

  public void setEnableCapture(boolean enableCapture) {
    this.enableCapture = enableCapture;
  }

  public boolean isManualCapture() {
    return manualCapture;
  }

  public void setManualCapture(boolean manualCapture) {
    this.manualCapture = manualCapture;
  }
}
