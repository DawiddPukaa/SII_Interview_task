package com.myConference.SIIProject;

import com.myConference.SIIProject.domain.confobjs.lecture.Lecture;
import com.myConference.SIIProject.domain.confobjs.lecture.LectureRepository;
import com.myConference.SIIProject.domain.confobjs.temathicpath.ThematicPath;
import com.myConference.SIIProject.domain.confobjs.temathicpath.ThematicPathReposiotry;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SiiProjectApplication {

    private static final String[] topics = {"Java", "C++", ".Net"};

    public static void main(String[] args) {
        SpringApplication.run(SiiProjectApplication.class, args);

    }

    //@org.jetbrains.annotations.NotNull
    //@org.jetbrains.annotations.Contract(pure = true)
    @Bean
    @ConditionalOnProperty(name = "load-initial-data", havingValue = "true")
    public static CommandLineRunner initialDataLoader(LectureRepository lectureRepository,
                                                      ThematicPathReposiotry thematicPathReposiotry) {
        return (args) -> {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (j == 0) {
                        ThematicPath thematicPath = new ThematicPath();
                        thematicPath.setNameOfThematicPath(topics[i]);
                        thematicPathReposiotry.save(thematicPath);
                    }
                    Lecture lecture = new Lecture();
                    lecture.setNameOfLecture(topics[i]+" "+ i+1);
                    lecture.setLectureLayer(j+1);
                    lectureRepository.save(lecture);
                }
            }
        };
    }
}
