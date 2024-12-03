import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;

public class Car extends JPanel{

    public Car(){
        setBackground(new Color(214, 255, 250));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Устанавливаем антиалиасинг для более гладких линий
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Создаем объект Path2D для соединения тела машины
        Path2D mBody = new Path2D.Double();

        // Начинаем рисовать с первого сегмента
        mBody.moveTo(915, 460); // точка начала
        mBody.lineTo(1045, 460);

        // Добавляем разные дуги для тела машины
        mBody.append(new Arc2D.Double(1015, 370, 60, 90, 270, 125, Arc2D.OPEN), true);
        mBody.append(new Arc2D.Double(610, 225, 460, 320, 0, 90, Arc2D.OPEN), true);
        mBody.append(new Arc2D.Double(120, 50, 720, 360, 40, 120, Arc2D.OPEN), true);
        mBody.append(new Arc2D.Double(65, 180, 355, 380, 135, 40, Arc2D.OPEN), true);
        mBody.append(new Arc2D.Double(30, 360, 135, 165, 119, 40, Arc2D.OPEN), true);
        mBody.append(new Arc2D.Double(33, 365, 130, 115, 180, 42, Arc2D.OPEN), true);
        mBody.lineTo(170, 460);
        mBody.append(new Arc2D.Double(170, 335, 230, 250, 180, -180, Arc2D.OPEN), true);
        mBody.lineTo(685, 460);
        mBody.append(new Arc2D.Double(685, 335, 230, 250, 180, -180, Arc2D.OPEN), true);

        // Закрываем тело машины
        mBody.closePath();

        // Отрисовываем тело машины
        g2d.setColor(Color.YELLOW); // Устанавливаем цвет заливки фигуры (желтый)
        g2d.fill(mBody); // Заполняем фигуру
        g2d.setColor(Color.BLACK); // Устанавливаем цвет контура (черный)
        g2d.setStroke(new BasicStroke(2)); // Устанавливаем толщину контура
        g2d.draw(mBody); // Рисуем контур фигуры

        // Добавляем окно машины
        Path2D mTopWindow = new Path2D.Double();
        mTopWindow.moveTo(811, 234); // Начинаем рисовать окно
        mTopWindow.append(new Arc2D.Double(210, 95, 620, 420, 20, 77, Arc2D.OPEN), true);
        mTopWindow.lineTo(482,234);
        mTopWindow.closePath(); // Закрываем контур окна

        // Отрисовываем окно машины
        g2d.setColor(Color.WHITE); // Устанавливаем цвет заливки фигуры (белый)
        g2d.fill(mTopWindow); // Заполняем фигуру
        g2d.setColor(Color.BLACK); // Устанавливаем цвет контура (черный)
        g2d.setStroke(new BasicStroke(2)); // Устанавливаем толщину контура
        g2d.draw(mTopWindow); // Рисуем контур фигуры

        // Добавляем окно машины
        Path2D mBackWindow = new Path2D.Double();
        mBackWindow.moveTo(430, 235); // Начинаем рисовать окно
        mBackWindow.lineTo(430,105);
        mBackWindow.append(new Arc2D.Double(160, 95, 720, 420, 105, 56, Arc2D.OPEN), true);

        mBackWindow.closePath(); // Закрываем контур окна

        // Отрисовываем 2 окно машины
        g2d.setColor(Color.WHITE); // Устанавливаем цвет заливки фигуры (белый)
        g2d.fill(mBackWindow); // Заполняем фигуру
        g2d.setColor(Color.BLACK); // Устанавливаем цвет контура (черный)
        g2d.setStroke(new BasicStroke(2)); // Устанавливаем толщину контура
        g2d.draw(mBackWindow); // Рисуем контур фигуры

        // Отрисовываем Ручку входной двери
        Path2D handle = new Path2D.Double();
        handle.moveTo(540,275);
        handle.lineTo(500,275);
        handle.closePath();

        // отрисовываем Ручку
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(3));
        g2d.draw(handle);

        //добавляем колёса машине
        g2d.setColor(Color.BLACK);
        g2d.fillOval(190,360,190,185);
        g2d.fillOval(707,360,190,185);

        g2d.setColor(Color.WHITE);
        g2d.fillOval(242,410,85,85);
        g2d.fillOval(762,410,85,85);

        // добавляем переднюю фару
        Path2D headlight = new Path2D.Double();
        headlight.moveTo(1025,338);
        headlight.append(new Arc2D.Double(870,275,160,145,9,94, Arc2D.OPEN),true);
        headlight.append(new Arc2D.Double(930,195,160,145,190,90, Arc2D.OPEN),true);
        headlight.closePath();

        // отрисовываем Фару
        g2d.setColor(Color.WHITE);
        g2d.fill(headlight);

        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(2));
        g2d.draw(headlight);
    }
}
