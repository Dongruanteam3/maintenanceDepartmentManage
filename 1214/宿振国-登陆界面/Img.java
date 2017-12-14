package Code;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Img
 */
public class Img extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Img() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		// ��ֹҳ�汻���棬��֤ÿ�������µ���֤��
		response.setHeader("Pragma", "No-Cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setIntHeader("Expires", 0);
		//������Ӧ����
		response.setContentType("image/jpeg");

		//������֤��ͼ�εĴ�С
		int width = 100;
		int height = 18;
		//����һ����ͼƬ
		BufferedImage image = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);
		//��ͼ
		Graphics g = image.getGraphics();
		g.setFont(new Font("Arial Black", Font.PLAIN, 16));
		g.setXORMode(Color.BLACK);
		g.setColor(getRandomColor(200,250));
		g.fillRect(1, 1, width - 1, height - 1);
		g.setColor(new Color(102, 102, 102));
		g.drawRect(0, 0, width - 1, height - 1);

		//����һЩ����������û����Եø�����
		Random r = new Random();
		g.setColor(getRandomColor(160, 200));
		for (int i = 0; i < 155; i++) {
			int x0 = r.nextInt(width) - 1;
			int y0 = r.nextInt(height) - 1;
			int x1 = r.nextInt(12) + 1;
			int y1 = r.nextInt(6) + 1;
			g.drawLine(x0, y0, x0 + x1, y0 + y1);
		}
		for (int i = 0; i < 70; i++) {
			int x0 = r.nextInt(width) - 1;
			int y0 = r.nextInt(height) - 1;
			int x1 = r.nextInt(12) + 1;
			int y1 = r.nextInt(6) + 1;
			g.drawLine(x0, y0, x0 - x1, y0 - y1);
		}
		//������֤��
		int size = 6;
		//ȡ��һ��6λ�������֤��
		String randomString = getRandomString(size);
		//������֤��
		for (int i = 0; i < size; i++) {
			g.setColor(new Color(100 + r.nextInt(110), 100 + r.nextInt(110),
					100 + r.nextInt(110)));
			g.drawString(randomString.substring(i, i + 1), i * 15 + 10, 15);
		}
		g.dispose();
		//����֤�뷢�������
		ImageIO.write(image, "JPEG", response.getOutputStream());
	}
/**
* ����һ���������ɫ
* ע�������ɫ�������ޱ߼ʵĲ�����������֤��һ��Ҳ������
* @param fc
* @param bc
* @return
*/
	private Color getRandomColor(int fc, int bc) {
		if (fc > 255)
			fc = 255;
		if (bc > 255)
			bc = 255;
		Random r = new Random();
		int red = r.nextInt(bc - fc);
		int green = r.nextInt(bc - fc);
		int blue = r.nextInt(bc - fc);
		return new Color(red, green, blue);
	}

	/**
	 * @param size
	 *            ����ַ����ĳ���
	 * @return ����ַ���
	 */
	private String getRandomString(int size) {
		StringBuilder builder = new StringBuilder();
		Random r = new Random();
		int count = 0;
		while (count < size) {
			int temp = r.nextInt('z' + 1);
			if ((temp >= 'A' && temp <= 'Z') || (temp >= 'a' && temp <= 'z')

					|| (temp >= '0' && temp <= '9')) {
				builder.append((char) temp);
				count++;
			}
		}
		return builder.toString();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
