package org.nenocom.nenocom;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView.Renderer;

public class MiRenderer implements Renderer {

	public MiRenderer(OrionActivity orionActivity) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onDrawFrame(GL10 gl) {
		GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);

	}

	@Override
	public void onSurfaceChanged(GL10 gl, int width, int height) {
		GLES20.glViewport(0, 0, width, height);

	}

	@Override
	public void onSurfaceCreated(GL10 gl, EGLConfig config) {
		GLES20.glClearColor((float) Math.random(), (float) Math.random(),
				(float) Math.random(), 1f);
		// cambio1
	}

}
