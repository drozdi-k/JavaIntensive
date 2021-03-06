package Collections;

import java.util.*;

import org.apache.log4j.Logger;

public class MagBall {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(MagBall.class);
        Map<Integer,Answers> answer = new HashMap<>();
        answer.put(1, new Answers("It is certain (Бесспорно)"));
        answer.put(2, new Answers("It is decidedly so (Предрешено)"));
        answer.put(3, new Answers("Without a doubt (Никаких сомнений)"));
        answer.put(4, new Answers("Yes — definitely (Определённо да)"));
        answer.put(5, new Answers("You may rely on it (Можешь быть уверен в этом)"));
        answer.put(6, new Answers("As I see it, yes (Мне кажется — «да»)"));
        answer.put(7, new Answers("Most likely (Вероятнее всего)"));
        answer.put(8, new Answers("Outlook good (Хорошие перспективы)"));
        answer.put(9, new Answers("Signs point to yes (Знаки говорят — «да»)"));
        answer.put(10, new Answers("Yes (Да)"));
        answer.put(11, new Answers("Reply hazy, try again (Пока не ясно, попробуй снова)"));
        answer.put(12, new Answers("Ask again later (Спроси позже)"));
        answer.put(13, new Answers("Better not tell you now (Лучше не рассказывать)"));
        answer.put(14, new Answers("Cannot predict now (Сейчас нельзя предсказать)"));
        answer.put(15, new Answers("Concentrate and ask again (Сконцентрируйся и спроси опять)"));
        answer.put(16, new Answers("Don’t count on it (Даже не думай)"));
        answer.put(17, new Answers("My reply is no (Мой ответ — «нет»)"));
        answer.put(18, new Answers("My sources say no (По моим данным — «нет»)"));
        answer.put(19, new Answers("Outlook not so good (Перспективы не очень хорошие)"));
        answer.put(20, new Answers("Very doubtful (Весьма сомнительно)"));

        Random randomGenerator = new Random();
        int a = randomGenerator.nextInt(answer.size());
        logger.info("a = "+a);
        logger.info(answer.get(a).text);
    }

}
