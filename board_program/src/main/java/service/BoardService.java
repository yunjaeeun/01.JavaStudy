package service;

import repository.BoardRepository;

public class BoardService {
    BoardRepository br = new BoardRepository();
    public void deleteBoard(int boardNo) {
        int result = br.deleteBoard(boardNo);
        if (result > 0) {
            System.out.println(boardNo + "번 게시물 삭제를 성공하였습니다.");
            return;
        }
        System.out.println("게시물 삭제에 실패하였습니다.");
    }
}
