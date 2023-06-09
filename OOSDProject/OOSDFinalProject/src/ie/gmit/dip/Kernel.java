package ie.gmit.dip;

public enum Kernel {

	IDENTITY(new double[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }),

	EDGE_DETECTION_1(new double[][] { { -1, -1, -1 }, { -1, 8, -1 }, { -1, -1, -1 } }),

	EDGE_DETECTION_2(new double[][] { { 1, 0, -1 }, { 0, 0, 0 }, { -1, 0, 1 } }),

	LAPLACIAN(new double[][] { { 0, -1, 0 }, { -1, 4, -1 }, { 0, -1, 0 } }),

	SHARPEN(new double[][] { { 0, -1, 0 }, { -1, 5, -1 }, { 0, -1, 0 } }),

	VERTICAL_LINES(new double[][] { { -1, 2, -1 }, { -1, 2, -1 }, { -1, 2, -1 } }),

	HORIZONTAL_LINES(new double[][] { { -1, -1, -1 }, { 2, 2, 2 }, { -1, -1, -1 } }),

	BOX_BLUR(new double[][] { { 0.111, 0.111, 0.111 }, { 0.111, 0.111, 0.111 }, { 0.111, 0.111, 0.111 } }),

	FILTER(new double[][] { { -2, -2, -2, -2, -2 }, { -2, -1, -1, -1, -2 }, { 0, 0.5, 1, 0.5, -0 }, { 2, 1, 1, 1, 2 },
			{ 2, 2, 2, 2, 2 } });

	private double[][] kernels;

	Kernel(double[][] k) {
		this.setKernels(k);
	}

	void Kernel(double[][] kernels) {
		this.kernels = kernels;
	}

	public double[][] getKernels() {
		return kernels;
	}

	public void setKernels(double[][] kernels) {
		this.kernels = kernels;
	}

}
