package lesson.loging.ex1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    /*
    OFF: никакие логи не записываются, все будут проигнорированы;
    FATAL: ошибка, после которой приложение уже не сможет работать и будет остановлено, например, JVM out of memory error;
    ERROR: уровень ошибок, когда есть проблемы, которые нужно решить. Ошибка не останавливает работу приложения в целом. Остальные запросы могут работать корректно;
    WARN: обозначаются логи, которые содержат предостережение. Произошло неожиданное действие, несмотря на это система устояла и выполнила запрос;
    INFO: лог, который записывает важные действия в приложении. Это не ошибки, это не предостережение, это ожидаемые действия системы;
    DEBUG: логи, необходимые для отладки приложения. Для уверенности в том, что система делает именно то, что от нее ожидают, или описания действия системы: “method1 начал работу”;
    TRACE: менее приоритетные логи для отладки, с наименьшим уровнем логирования;
    ALL: уровень, при котором будут записаны все логи из системы.
     */
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class);
        logger.debug("Старт программы");
        int a = 5;
        int b = 0;
        if(b==0) {
            logger.warn("Знаменатель равен 0");
        }
        int res = 0;
        try {
            res = a / b;
        }catch(Exception e){
            logger.error(e.toString());
        }
        System.out.println(res);
        logger.debug("Поделили "+a+" на "+b+", деление = "+res);
        logger.info("Произошла операция деления");

//        logger.debug("Поделили {} на {}", a,b);

        logger.debug("ЗАвершение работы");


    }
}
