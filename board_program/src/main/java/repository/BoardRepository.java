package repository;

import aggregate.Board;
import aggregate.CategoryType;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class BoardRepository {

    private ArrayList<Board> boardList = new ArrayList<>();

    public BoardRepository() {
        File file = new File("src/main/java/db/boardDb.dat");
        if (!file.exists()) {
            ArrayList<Board> boards = new ArrayList<>();
            boards.add(new Board(1, "User01", "내용", "날짜", "제목", CategoryType.FREE));
            boards.add(new Board(2, "User02", "내용", "날짜", "제목", CategoryType.FREE));
            boards.add(new Board(3, "User03", "내용", "날짜", "제목", CategoryType.FREE));

            saveBoards(boards);
        }
        loadBoards();
    }

    private void loadBoards() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream("src/main/java/db/boardDb.dat")));
            while (true) {
                boardList.add((Board) (ois.readObject()));
            }

        } catch (EOFException e) {
            System.out.println("게시판 전부 로딩됨...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (ois != null) ois.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public int deleteBoard(int boardNo) {
        for (int i = 0; i < boardList.size(); i++) {
            if (boardList.get(i).getBoardNo() == boardNo) {      // 지우려는 게시판과 같은 게시판 번호인 index 찾기
                boardList.remove(i);
                saveBoards(boardList);
                return 1;
            }
        }
        return 0;
    }

    private void saveBoards(ArrayList<Board> boardList) {
        ObjectOutputStream oos = null;
        try {
            new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("src/main/java/db/boardDb.dat")));

            for (Board b : boardList) {
                oos.writeObject(b);
            }

            oos.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (oos != null) oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
